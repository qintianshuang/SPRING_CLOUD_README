package com.example.cloud.company.common.vo.xgm.xml;

import com.example.cloud.common.config.Logger;
import com.example.cloud.company.common.vo.xgm.hdxx.XmlVO;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.*;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

public class JaxbXmlParse extends Marshaller.Listener implements IXmlParse {
    private static HashMap<String, JAXBContext> contextMap = new HashMap();
    private final Logger log = Logger.getLogger(JaxbXmlParse.class);

    public JaxbXmlParse() {
    }

    public XmlVO doParse(byte[] xml, Class clazz, String encoding) {
        Object object = null;
        XmlVO xmlVO = new XmlVO();
        XMLStreamReader read = null;

        try {
            JAXBContext context = this.getContext(clazz);
            Unmarshaller um = context.createUnmarshaller();
            if (StringUtils.isBlank(encoding)) {
                read = XMLInputFactory.newInstance().createXMLStreamReader(new ByteArrayInputStream(xml));
            } else {
                read = XMLInputFactory.newInstance().createXMLStreamReader(new ByteArrayInputStream(xml), encoding);
            }

            object = um.unmarshal(read);
            if (object instanceof JAXBElement) {
                JAXBElement element = (JAXBElement)object;
                xmlVO.setXmlParse(element.getValue());
            } else {
                xmlVO.setXmlParse(object);
            }

            xmlVO.setSuccess(true);
        } catch (JAXBException var24) {
            xmlVO.setSuccess(false);
            this.log.error("获取JAXB上下文异常，XML内容：" + new String(xml), var24);
        } catch (XMLStreamException var25) {
            xmlVO.setSuccess(false);
            this.log.error("解析XML异常", var25);
        } catch (FactoryConfigurationError var26) {
            xmlVO.setSuccess(false);
            this.log.error("解析工厂配置异常", var26);
        } catch (Exception var27) {
            xmlVO.setSuccess(false);
            this.log.error("解析XML发生未知异常", var27);
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (XMLStreamException var23) {
                    this.log.error("关闭XML Reader发生错误。", var23);
                }
            }

        }

        return xmlVO;
    }

    protected JAXBContext getContext(Class clazz) throws JAXBException {
        JAXBContext context = (JAXBContext)contextMap.get(clazz.getName());
        if (context == null) {
            Class var3 = JaxbXmlParse.class;
            synchronized(JaxbXmlParse.class) {
                if (contextMap.get(clazz.getName()) == null) {
                    context = JAXBContext.newInstance(new Class[]{clazz});
                    contextMap.put(clazz.getName(), context);
                }
            }

            context = (JAXBContext)contextMap.get(clazz.getName());
        }

        return context;
    }

    public void afterUnmarshal(Object target, Object parent) {
    }
}


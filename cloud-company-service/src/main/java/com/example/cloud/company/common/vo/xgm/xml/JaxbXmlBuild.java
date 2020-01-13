package com.example.cloud.company.common.vo.xgm.xml;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class JaxbXmlBuild implements IXmlBuild {
    private final Log log = LogFactory.getFactory().getInstance(JaxbXmlBuild.class);
    private static HashMap<String, JAXBContext> contextMap = new HashMap();

    public JaxbXmlBuild() {
    }

    public String build(Object nodeObj, String encoding) {
        Class cla = nodeObj.getClass();
        ByteArrayOutputStream os = new ByteArrayOutputStream();

        try {
            JAXBContext context = this.getContext(cla.getPackage().getName());
            Marshaller marshaller = context.createMarshaller();
            if (!StringUtils.isBlank(encoding)) {
                marshaller.setProperty("jaxb.encoding", encoding);
            }

            marshaller.marshal(nodeObj, os);
        } catch (JAXBException var8) {
            this.log.error("由JAVA BEAN 生成XML错误：", var8);
            var8.printStackTrace();
        }

        try {
            return os.toString(encoding);
        } catch (UnsupportedEncodingException var7) {
            return os.toString();
        }
    }

    protected JAXBContext getContext(String beanPack) throws JAXBException {
        JAXBContext context = (JAXBContext)contextMap.get(beanPack);
        if (context == null) {
            Class var3 = JaxbXmlBuild.class;
            synchronized(JaxbXmlBuild.class) {
                if (contextMap.get(beanPack) == null) {
                    context = JAXBContext.newInstance(beanPack);
                    contextMap.put(beanPack, context);
                }
            }

            context = (JAXBContext)contextMap.get(beanPack);
        }

        return context;
    }
}


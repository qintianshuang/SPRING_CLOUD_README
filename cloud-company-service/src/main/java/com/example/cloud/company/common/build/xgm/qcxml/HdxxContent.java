package com.example.cloud.company.common.build.xgm.qcxml;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.util.SpringUtil;
import com.example.cloud.company.common.vo.xgm.hdxx.LsxxVo;
import com.example.cloud.company.common.vo.xgm.qcxx.WsxxVo;
import com.example.cloud.service.util.FileUtil;
import com.example.cloud.service.util.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class HdxxContent {

    private static final Logger LOG = Logger.getLogger(HdxxContent.class);

    private static final String WSXX = "WSXX";
    private static final String LSXX = "LSXX";
    private static final String SBXX = "SBXX";
    //redis 数据失效时间
    private static final int time = 43200;

    @Autowired
    private RedisUtil redisUtil;

    public static List<WsxxVo> getWsxxVoList(String djxh, MultipartFile wsxxXml) throws Exception {
        RedisUtil redisUtil = SpringUtil.getBean(RedisUtil.class);
        String s = "";
        if (wsxxXml != null) {
            File file = FileUtil.multipartFileToFile(wsxxXml);
            s = FileUtil.ResolveJsonFileToString(file.getName());
        } else {
            if (StringUtils.isBlank(s)) {
                s = (String) redisUtil.getValue(WSXX);
            }
            if (StringUtils.isBlank(s)) {
                throw new FileNotFoundException("传入的文件有误！");
            }
        }
        JSONObject jsonObject = JSONObject.parseObject(s);
        Object object = jsonObject.get(WSXX);
        JSONArray objects = JSONObject.parseArray(object.toString());
        if (!CollectionUtils.isEmpty(objects)) {
            List<WsxxVo> wsxxVos = new ArrayList<>();
            WsxxVo wsxxVo = null;
            for (Object o : objects) {
                wsxxVo = new WsxxVo();
                Map<String, String> map = (Map<String, String>) o;
                wsxxVo.setCODE(map.get("CODE"));
                wsxxVo.setNAME(map.get("NAME"));
                wsxxVo.setVALUE(map.get("VALUE"));
                wsxxVos.add(wsxxVo);
            }
            LOG.info("wsxxVos" + JSONObject.toJSONString(wsxxVos));
            redisUtil.setValueExpireKey(WSXX, s, time);
            return wsxxVos;
        }
        throw new FileNotFoundException("传入的文件有误！");
    }

    public static String getRequestXml(String djxh, MultipartFile sbXml) throws Exception {
        RedisUtil redisUtil = SpringUtil.getBean(RedisUtil.class);
        String s = "";
        if (sbXml != null) {
            File file = FileUtil.multipartFileToFile(sbXml);
            s = FileUtil.ResolveJsonFileToString(file.getName());
        } else {
            if (StringUtils.isBlank(s)) {
                s = (String) redisUtil.getValue(SBXX);
//                s = JSONObject.parse(s).toString();
            }
            if (StringUtils.isBlank(s)) {
                throw new FileNotFoundException("传入的文件有误！");
            }
        }
//        String str = s;
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><taxML xsi:type=\"HXZGSB00045Request\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_SB_00045_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid/><jmxxGrid/><yjxxGrid/><sbbcTjqtxxVO><djxh>10114403000027517547</djxh><zxbztzsuuid/><qzdbz>Y</qzdbz><scenceCs/><hyDm>5011</hyDm></sbbcTjqtxxVO><zzssyyxgmnsrySbSbbdxxVO xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\"><zzsxgmfjssb><xgmfjsxxGrid><xgmfjsxxGridlb><sybh>X</sybh><rdpzuuid>7E12D4A8D7670141E0536F6767561E8C</rdpzuuid><zsxmDm>10109</zsxmDm><zspmDm>101090101</zspmDm><jsyj>6000.00</jsyj><sl1>0.07</sl1><ynse>420.00</ynse><ssjmxzDm/><jmse>0.00</jmse><yjse1>0.00</yjse1><ybtse>210.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0007049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>210.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb><xgmfjsxxGridlb><sybh>Y</sybh><rdpzuuid>7E12D50729510141E0536F6767561E8C</rdpzuuid><zsxmDm>30203</zsxmDm><zspmDm>302030100</zspmDm><jsyj>6000.00</jsyj><sl1>0.03</sl1><ynse>180.00</ynse><ssjmxzDm>0061042802</ssjmxzDm><jmse>180.00</jmse><yjse1>0.00</yjse1><ybtse>0.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0061049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>0.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb><xgmfjsxxGridlb><sybh>Z</sybh><rdpzuuid>7E12D5656BEF0141E0536F6767561E8C</rdpzuuid><zsxmDm>30216</zsxmDm><zspmDm>302160100</zspmDm><jsyj>6000.00</jsyj><sl1>0.02</sl1><ynse>120.00</ynse><ssjmxzDm>0061042802</ssjmxzDm><jmse>120.00</jmse><yjse1>0.00</yjse1><ybtse>0.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0099049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>0.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb><xgmfjsxxGridlb><sybh>Q</sybh><rdpzuuid>7E12D4B8F5DA0141E0536F6767561E8C</rdpzuuid><zsxmDm>10109</zsxmDm><zspmDm>101090101</zspmDm><jsyj>0.00</jsyj><sl1>0.07</sl1><ynse>0.00</ynse><ssjmxzDm/><jmse>0.00</jmse><yjse1>0.00</yjse1><ybtse>0.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0007049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>0.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb><xgmfjsxxGridlb><sybh>S</sybh><rdpzuuid>7E12D5030E970141E0536F6767561E8C</rdpzuuid><zsxmDm>30203</zsxmDm><zspmDm>302030100</zspmDm><jsyj>0.00</jsyj><sl1>0.03</sl1><ynse>0.00</ynse><ssjmxzDm/><jmse>0.00</jmse><yjse1>0.00</yjse1><ybtse>0.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0061049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>0.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb><xgmfjsxxGridlb><sybh>T</sybh><rdpzuuid>7E12D54D36AB0141E0536F6767561E8C</rdpzuuid><zsxmDm>30216</zsxmDm><zspmDm>302160100</zspmDm><jsyj>0.00</jsyj><sl1>0.02</sl1><ynse>0.00</ynse><ssjmxzDm/><jmse>0.00</jmse><yjse1>0.00</yjse1><ybtse>0.00</ybtse><rdyxqq/><rdyxqz/><phjmxzDm>0099049901</phjmxzDm><phjzbl>0.5</phjzbl><phjmse>0.00</phjmse><phjmswsxDm/></xgmfjsxxGridlb></xgmfjsxxGrid></zzsxgmfjssb><zzsxgmflzl><flzlForm><qcye>0.00</qcye><bqfse>0.00</bqfse><bqkce>0.00</bqkce><qmye>0.00</qmye><ysfwxsqbhssr>0.00</ysfwxsqbhssr><ysfwxshsxse>0.00</ysfwxshsxse><ysfwxsbhsxse>0.00</ysfwxsbhsxse><qcye5>0.00</qcye5><bqfse5>0.00</bqfse5><bqkce5>0.00</bqkce5><qmye5>0.00</qmye5><ysfwxsqbhssr5>0.00</ysfwxsqbhssr5><ysfwxshsxse5>0.00</ysfwxshsxse5><ysfwxsbhsxse5>0.00</ysfwxsbhsxse5></flzlForm></zzsxgmflzl><zzsjmssbmxb><zzsjmssbmxbjsxmGrid><zzsjmssbmxbjsxmGridlbVO><ewbhxh>1</ewbhxh><hmc>�ϼ�</hmc><swsxDm/><qcye>0.00</qcye><bqfse>0.00</bqfse><bqydjse>0.00</bqydjse><bqsjdjse>0.00</bqsjdjse><qmye>0.00</qmye></zzsjmssbmxbjsxmGridlbVO></zzsjmssbmxbjsxmGrid><zzsjmssbmxbmsxmGrid><zzsjmssbmxbmsxmGridlbVO><ewbhxh>1</ewbhxh><hmc>�ϼ�</hmc><swsxDm/><mzzzsxmxse>0.00</mzzzsxmxse><bqsjkcje>0.00</bqsjkcje><kchmsxse>0.00</kchmsxse><msxsedyjxse>0.00</msxsedyjxse><mse>0.00</mse></zzsjmssbmxbmsxmGridlbVO><zzsjmssbmxbmsxmGridlbVO><ewbhxh>2</ewbhxh><hmc>������˰</hmc><swsxDm/><mzzzsxmxse>0.00</mzzzsxmxse></zzsjmssbmxbmsxmGridlbVO><zzsjmssbmxbmsxmGridlbVO><ewbhxh>3</ewbhxh><hmc>���У��羳����</hmc><swsxDm/><mzzzsxmxse>0.00</mzzzsxmxse></zzsjmssbmxbmsxmGridlbVO></zzsjmssbmxbmsxmGrid></zzsjmssbmxb><zzssyyxgmnsr><sbbhead><nsrsbh>91440300094079230F</nsrsbh><nsrmc>������Ҽ·��Խ��������������\u07B9�˾</nsrmc><skssqq>20190401</skssqq><skssqz>20190630</skssqz><sbsxDm1>11</sbsxDm1><sbrq1>20191219</sbrq1></sbbhead><zzsxgmGrid><zzsxgmGridlb><ewblxh>1</ewblxh><lmc>���Ｐ��������</lmc><yzzzsbhsxse>200000.00</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>200000.00</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>0.00</skqjkjdptfpbhsxse><xsczbdcbhsxse/><swjgdkdzzszyfpbhsxse1/><skqjkjdptfpbhsxse2/><xssygdysgdzcbhsxse>0.00</xssygdysgdzcbhsxse><skqjkjdptfpbhsxse1>0.00</skqjkjdptfpbhsxse1><msxse>10000.00</msxse><xwqymsxse>10000.00</xwqymsxse><wdqzdxse>0.00</wdqzdxse><qtmsxse>0.00</qtmsxse><ckmsxse>0.00</ckmsxse><skqjkjdptfpxse1>0.00</skqjkjdptfpxse1><hdxse>0.00</hdxse><bqynse>6000.00</bqynse><hdynse>0.00</hdynse><bqynsejze>0.00</bqynsejze><bqmse>300.00</bqmse><xwqymse>300.00</xwqymse><wdqzdmse>0.00</wdqzdmse><ynsehj>6000.00</ynsehj><bqyjse1>0.00</bqyjse1><bqybtse>6000.00</bqybtse><bdcxse>0.00</bdcxse></zzsxgmGridlb><zzsxgmGridlb><ewblxh>2</ewblxh><lmc>���\uD946\uDCB2�����������ʲ�����</lmc><yzzzsbhsxse>0.00</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>0.00</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>0.00</skqjkjdptfpbhsxse><xsczbdcbhsxse>0.00</xsczbdcbhsxse><swjgdkdzzszyfpbhsxse1>0.00</swjgdkdzzszyfpbhsxse1><skqjkjdptfpbhsxse2>0.00</skqjkjdptfpbhsxse2><xssygdysgdzcbhsxse/><skqjkjdptfpbhsxse1/><msxse>0.00</msxse><xwqymsxse>0.00</xwqymsxse><wdqzdxse>0.00</wdqzdxse><qtmsxse>0.00</qtmsxse><ckmsxse>0.00</ckmsxse><skqjkjdptfpxse1>0.00</skqjkjdptfpxse1><hdxse>0.00</hdxse><bqynse>0.00</bqynse><hdynse>0.00</hdynse><bqynsejze>0.00</bqynsejze><bqmse>0.00</bqmse><xwqymse>0.00</xwqymse><wdqzdmse>0.00</wdqzdmse><ynsehj>0.00</ynsehj><bqyjse1>0.00</bqyjse1><bqybtse>0.00</bqybtse><bdcxse>0.00</bdcxse></zzsxgmGridlb><zzsxgmGridlb><ewblxh>3</ewblxh><lmc>���Ｐ�������ۼ�</lmc><yzzzsbhsxse>10200000.00</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>200000.00</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>10000000</skqjkjdptfpbhsxse><xsczbdcbhsxse/><swjgdkdzzszyfpbhsxse1/><skqjkjdptfpbhsxse2/><xssygdysgdzcbhsxse>0</xssygdysgdzcbhsxse><skqjkjdptfpbhsxse1>0</skqjkjdptfpbhsxse1><msxse>10000.00</msxse><xwqymsxse>10000.00</xwqymsxse><wdqzdxse>0</wdqzdxse><qtmsxse>0</qtmsxse><ckmsxse>0</ckmsxse><skqjkjdptfpxse1>0</skqjkjdptfpxse1><hdxse>0.00</hdxse><bqynse>306000.00</bqynse><hdynse>0.00</hdynse><bqynsejze>10000.00</bqynsejze><bqmse>300.00</bqmse><xwqymse>300.00</xwqymse><wdqzdmse>0.00</wdqzdmse><ynsehj>296000.00</ynsehj><bqyjse1/><bqybtse/><bdcxse>0.00</bdcxse></zzsxgmGridlb><zzsxgmGridlb><ewblxh>4</ewblxh><lmc>���\uD946\uDCB2�����������ʲ����ۼ�</lmc><yzzzsbhsxse>0.00</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>0.00</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>0</skqjkjdptfpbhsxse><xsczbdcbhsxse>0</xsczbdcbhsxse><swjgdkdzzszyfpbhsxse1>0</swjgdkdzzszyfpbhsxse1><skqjkjdptfpbhsxse2>0</skqjkjdptfpbhsxse2><xssygdysgdzcbhsxse/><skqjkjdptfpbhsxse1/><msxse>0.00</msxse><xwqymsxse>0</xwqymsxse><wdqzdxse>0</wdqzdxse><qtmsxse>0</qtmsxse><ckmsxse>0</ckmsxse><skqjkjdptfpxse1>0</skqjkjdptfpxse1><hdxse>0.00</hdxse><bqynse>0.00</bqynse><hdynse>0.00</hdynse><bqynsejze>0.00</bqynsejze><bqmse>0</bqmse><xwqymse>0</xwqymse><wdqzdmse>0</wdqzdmse><ynsehj>0.00</ynsehj><bqyjse1/><bqybtse/><bdcxse>0</bdcxse></zzsxgmGridlb></zzsxgmGrid><slxxForm><sfzxsb/><bsrxm/><cwfzrxm/><fddbrxm/><bsrlxdh/><dlrmc/><jbrxm/><slswjgDm/><slswjgMc/><jbrlxdh/><slrDm/><slrxm/><slrq/></slxxForm></zzssyyxgmnsr></zzssyyxgmnsrySbSbbdxxVO></taxML>";
        String string = JSONObject.toJSONString(str);
        redisUtil.setValueExpireKey(SBXX, s, time);
        return str;
    }

    public static List<LsxxVo> getLsxxVoList(String djxh, MultipartFile lsxxXml) throws Exception {
        RedisUtil redisUtil = SpringUtil.getBean(RedisUtil.class);
        String s = "";
        if (lsxxXml != null) {
            File file = FileUtil.multipartFileToFile(lsxxXml);
            s = FileUtil.ResolveJsonFileToString(file.getName());
        } else {
            if (StringUtils.isBlank(s)) {
                s = (String) redisUtil.getValue(LSXX);
            }
            if (StringUtils.isBlank(s)) {
                throw new FileNotFoundException("传入的文件有误！");
            }
        }
        JSONObject jsonObject = JSONObject.parseObject(s);
        Object object = jsonObject.get(LSXX);
        JSONArray objects = JSONObject.parseArray(object.toString());
        if (!CollectionUtils.isEmpty(objects)) {
            List<LsxxVo> lsxxVos = new ArrayList<>();
            LsxxVo lsxxVo = null;
            for (Object o : objects) {
                lsxxVo = new LsxxVo();
                Map<String, String> map = (Map<String, String>) o;
                lsxxVo.setCODE(map.get("CODE"));
                lsxxVo.setNAME(map.get("NAME"));
                lsxxVo.setVALUE(map.get("VALUE"));
                lsxxVos.add(lsxxVo);
            }
            LOG.info("wsxxVos" + JSONObject.toJSONString(lsxxVos));
            redisUtil.setValueExpireKey(LSXX, s, time);
            return lsxxVos;
        }
        throw new FileNotFoundException("传入的文件有误！");
    }
}

package com.example.cloud.company.xml;

import com.alibaba.fastjson.JSONObject;
import com.example.cloud.common.config.Logger;
import com.example.cloud.service.util.ArithUtil;
import org.junit.Test;

import java.math.BigDecimal;

public class XmlTest {

    private static final Logger LOG = Logger.getLogger(XmlTest.class);

    @Test
    public void test() {
        String a = "9000000";
//        String b = "1000";
//        double c = Double.parseDouble(a);
//        double d = Double.parseDouble(b);
//        System.out.println("c：" + c);
//        System.out.println("d：" + d);
//        BigDecimal bigDecimal = new BigDecimal(c);
//        System.out.println("c:" + bigDecimal.toString());
//        double e = c + d;
//        System.out.println("e：" + e);
//        System.out.println("e:" + new BigDecimal(e).toString());
//        System.out.println("e: to double" + Double.toString(e));
        LOG.info("e: to double" + a);
    }

    @Test
    public void test1() {
        String a = "1000000";
        String b = "1000";
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        BigDecimal bigDecimal = new BigDecimal(a);
        BigDecimal bigDecimal2 = new BigDecimal(b);
        Double add = ArithUtil.add(c, d);
        System.out.println("add：" + add);
        System.out.println("bigDecimal：" + bigDecimal);
        System.out.println("bigDecimal2：" + bigDecimal2);
//        long i = bigDecimal + bigDecimal2;
//        System.out.println("i：" + i);
//        bigDecimal2
    }

    @Test
    public void test2() {
        String a = "<service xmlns=\"http://www.chinatax.gov.cn/spec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><head><tran_id>SWZJ.HXZG.SB.ZZSXGMSBSQJKJHQQCSJ</tran_id><channel_id>SZGS.NFWB.DZSWJII</channel_id><tran_seq>22d7441ed56d4ee7a7d87f183e46ffb8</tran_seq><tran_date>20191227</tran_date><tran_time>091502396</tran_time><rtn_code>0</rtn_code><rtn_msg><Code>000</Code> <Message></Message><Reason></Reason></rtn_msg><expand><name>identityType</name><value>SZGS.NFWB.DZSWJII</value></expand><expand><name>sjry</name><value>1440DZSWJII</value></expand><expand><name>sjjg</name><value>14403080900</value></expand></head><body><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><taxML xsi:type=\"HXZGSB00044Response\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid><sbxxGridlb><zsxmDm>10101</zsxmDm><zspmDm>101017190</zspmDm><hyDm>5011</hyDm><nsqxDm>08</nsqxDm><zsdlfsDm>0</zsdlfsDm><jkqxDm>04</jkqxDm><sbqxDm>04</sbqxDm><jkqx>2019-10-24</jkqx><skssqq>2019-07-01</skssqq><skssqz>2019-09-30</skssqz><djzclxDm>173</djzclxDm><sbqx>2019-10-24</sbqx><sl1>0.11</sl1><zsl>0.03</zsl><zgswskfjDm>14403080900</zgswskfjDm><swjgDm>14403080900</swjgDm><yjse>0.0</yjse><rdzsuuid>0</rdzsuuid><rdpzuuid>3DAB8DE094000916E0537F000001C0E8</rdpzuuid><zfsbz>0</zfsbz><ysbje>0.0</ysbje><sfysb>N</sfysb><rdyxqq>2016-04-01 00:00:00</rdyxqq><rdyxqz>9999-12-31 00:00:00</rdyxqz><wzsyhdjsyj>0.0</wzsyhdjsyj><qzd>0.0</qzd><djxh>10114403000027517547</djxh><wzsyjsyj>0.0</wzsyjsyj><wzsyhdse>0.0</wzsyhdse></sbxxGridlb><sbxxGridlb><zsxmDm>10101</zsxmDm><zspmDm>101014001</zspmDm><hyDm>5011</hyDm><nsqxDm>08</nsqxDm><zsdlfsDm>0</zsdlfsDm><jkqxDm>04</jkqxDm><sbqxDm>04</sbqxDm><jkqx>2019-10-24</jkqx><skssqq>2019-07-01</skssqq><skssqz>2019-09-30</skssqz><djzclxDm>173</djzclxDm><sbqx>2019-10-24</sbqx><sl1>0.17</sl1><zsl>0.03</zsl><zgswskfjDm>14403080900</zgswskfjDm><swjgDm>14403080900</swjgDm><yjse>0.0</yjse><rdzsuuid>0</rdzsuuid><rdpzuuid>3DAB8DE093FB0916E0537F000001C0E8</rdpzuuid><zfsbz>0</zfsbz><ysbje>0.0</ysbje><sfysb>N</sfysb><rdyxqq>2016-04-01 00:00:00</rdyxqq><rdyxqz>9999-12-31 00:00:00</rdyxqz><wzsyhdjsyj>0.0</wzsyhdjsyj><qzd>0.0</qzd><djxh>10114403000027517547</djxh><wzsyjsyj>0.0</wzsyjsyj><wzsyhdse>0.0</wzsyhdse></sbxxGridlb></sbxxGrid><jmxxGrid><jmxxGridlb><yhpzuuid>10114403000027517547SXA031900396</yhpzuuid><djxh>10114403000027517547</djxh><jmsspsxDm>SXA031900396</jmsspsxDm><zsxmDm>10101</zsxmDm><jmqxq>2019-01-01</jmqxq><jmqxz>2021-12-31</jmqxz><ssjmxzhzDm>0001013612</ssjmxzhzDm><jzed>0.0</jzed><tdjmBz>1</tdjmBz></jmxxGridlb><jmxxGridlb><yhpzuuid>10114403000027517547SXA031900832</yhpzuuid><djxh>10114403000027517547</djxh><jmsspsxDm>SXA031900832</jmsspsxDm><zsxmDm>10101</zsxmDm><jmqxq>2019-01-01</jmqxq><jmqxz>2021-12-31</jmqxz><ssjmxzhzDm>0001011814</ssjmxzhzDm><jzed>0.0</jzed><tdjmBz>1</tdjmBz></jmxxGridlb><jmxxGridlb><yhpzuuid>B99CD24C531F8980BE3C43907281FAEE</yhpzuuid><djxh>10114403000027517547</djxh><jmsspsxDm>SXA031900497</jmsspsxDm><zsxmDm>10101</zsxmDm><jmxmdlDm>99</jmxmdlDm><jmxmxlDm>999</jmxmxlDm><jmlxDm>2</jmlxDm><jmzlxDm>02</jmzlxDm><jmqxq>2019-01-01 00:00:00</jmqxq><jmqxz>2021-12-31 00:00:00</jmqxz><ssjmxzhzDm>0001083907</ssjmxzhzDm><ssjmxzdlDm>08</ssjmxzdlDm><ssjmxzxlDm>39</ssjmxzxlDm><jzfd>0.0</jzfd><jzsl>0.0</jzsl><jzed>0.0</jzed></jmxxGridlb></jmxxGrid><yjxxGrid/><zzsxgmnsrqcsxxGrid><zzsxgmnsrqcsxxGridlb><ewblxh>3</ewblxh><lmc>货物及劳务本年累计</lmc><yzzzsbhsxse>1.02E7</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>100000.0</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>1.01E7</skqjkjdptfpbhsxse><xsczbdcbhsxse>0.0</xsczbdcbhsxse><swjgdkdzzszyfpbhsxse1>0.0</swjgdkdzzszyfpbhsxse1><skqjkjdptfpbhsxse2>0.0</skqjkjdptfpbhsxse2><xssygdysgdzcbhsxse>0.0</xssygdysgdzcbhsxse><skqjkjdptfpbhsxse1>0.0</skqjkjdptfpbhsxse1><msxse>0.0</msxse><xwqymsxse>0.0</xwqymsxse><wdqzdxse>0.0</wdqzdxse><qtmsxse>0.0</qtmsxse><ckmsxse>0.0</ckmsxse><skqjkjdptfpxse1>0.0</skqjkjdptfpxse1><hdxse>0.0</hdxse><bqynse>306000.0</bqynse><hdynse>0.0</hdynse><bqynsejze>10000.0</bqynsejze><bqmse>0.0</bqmse><xwqymse>0.0</xwqymse><wdqzdmse>0.0</wdqzdmse><ynsehj>296000.0</ynsehj><bqyjse1>0.0</bqyjse1><bqybtse>0.0</bqybtse></zzsxgmnsrqcsxxGridlb><zzsxgmnsrqcsxxGridlb><ewblxh>4</ewblxh><lmc>服务、不动产和无形资产本年累计</lmc><yzzzsbhsxse>400000.0</yzzzsbhsxse><swjgdkdzzszyfpbhsxse>200000.0</swjgdkdzzszyfpbhsxse><skqjkjdptfpbhsxse>200000.0</skqjkjdptfpbhsxse><xsczbdcbhsxse>600000.0</xsczbdcbhsxse><swjgdkdzzszyfpbhsxse1>300000.0</swjgdkdzzszyfpbhsxse1><skqjkjdptfpbhsxse2>300000.0</skqjkjdptfpbhsxse2><xssygdysgdzcbhsxse>0.0</xssygdysgdzcbhsxse><skqjkjdptfpbhsxse1>0.0</skqjkjdptfpbhsxse1><msxse>0.0</msxse><xwqymsxse>0.0</xwqymsxse><wdqzdxse>0.0</wdqzdxse><qtmsxse>0.0</qtmsxse><ckmsxse>0.0</ckmsxse><skqjkjdptfpxse1>0.0</skqjkjdptfpxse1><hdxse>0.0</hdxse><bqynse>42000.0</bqynse><hdynse>0.0</hdynse><bqynsejze>0.0</bqynsejze><bqmse>0.0</bqmse><xwqymse>0.0</xwqymse><wdqzdmse>0.0</wdqzdmse><ynsehj>42000.0</ynsehj><bqyjse1>0.0</bqyjse1><bqybtse>0.0</bqybtse></zzsxgmnsrqcsxxGridlb></zzsxgmnsrqcsxxGrid><sbZzsxgmnsrqtxxVO><yqsbBz>Y</yqsbBz><yqsbMes>该纳税人本属期逾期申报（逾期天数64）</yqsbMes><zzsqzd>300000.0</zzsqzd><zzsysfwqzd>300000.0</zzsysfwqzd><yshwlwBz>Y</yshwlwBz><ysfwBz>Y</ysfwBz><yshwlwFpdkbhsxse>0.0</yshwlwFpdkbhsxse><ysfwFpdkbhsxse>0.0</ysfwFpdkbhsxse><ysfwFpdkbhsxse5>0.0</ysfwFpdkbhsxse5><dqdeBz>N</dqdeBz><dqdeYshwlwHdxse>0.0</dqdeYshwlwHdxse><dqdeYsfwHdxse>0.0</dqdeYsfwHdxse><dqdeYshwlwHdynse>0.0</dqdeYshwlwHdynse><dqdeYsfwHdynse>0.0</dqdeYsfwHdynse><zfjgBz>2</zfjgBz><yzl>0.0</yzl><desl1>0.0</desl1><fgdqyBz>N</fgdqyBz><fzjgfgdqyse>0.0</fzjgfgdqyse><ysfwydbyhyyjse>0.0</ysfwydbyhyyjse><hwlwydbyhyyjse>0.0</hwlwydbyhyyjse><flzlqcye>0.0</flzlqcye><flzlqcye5>0.0</flzlqcye5><qmsezzsskxtfy5>0.0</qmsezzsskxtfy5><qmsefzjgyzjnsk5>0.0</qmsefzjgyzjnsk5><qmsejzfwyzjnsk5>0.0</qmsejzfwyzjnsk5><qmsexsbdcyzjnsk5>0.0</qmsexsbdcyzjnsk5><qmseczbdcyzjnsk5>0.0</qmseczbdcyzjnsk5><yqwrdzzsybnsrBz>N</yqwrdzzsybnsrBz><ptfpsjkpje>0.0</ptfpsjkpje><zpje>0.0</zpje><ppje>0.0</ppje><iswkjfpsqd>N</iswkjfpsqd><fqmsqBz>Y</fqmsqBz><zgslhl>0.0</zgslhl><zgslfw>0.0</zgslfw><acsbxseHj>0.0</acsbxseHj><acsbfwxseHj>0.0</acsbfwxseHj></sbZzsxgmnsrqtxxVO></taxML>]]></body></service>";
        System.out.println(a);
        String string = JSONObject.toJSONString(a);
        System.out.println(string);
        Object parse = JSONObject.parse(string);
        System.out.println(parse);
    }
}

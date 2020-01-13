package com.example.cloud.company.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cloud.company.common.vo.xgm.hdxx.LsxxVo;
import com.example.cloud.company.common.vo.xgm.sbxx.sb.xgm.LsjdxxVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.ZzsxgmGridlbVO;
import com.example.cloud.service.base.vo.ResultVo;
import org.apache.commons.beanutils.BeanMap;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;

public class Jsontest {

    private final Map<String, Object> param = new HashMap<String, Object>();

    @Test
    public void test() throws NoSuchFieldException {
        String djxh = "";
        String json = "{ \t\"LSXX\": [\t{\t\"CODE\": \"1\",\t\"NAME\": \"应征增值税不含税销售额\",\t\"VALUE\": \"10000000.00\"\t},\t{\t\"CODE\": \"2\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"3\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"10000000.00\"\t},\t{\t\"CODE\": \"4\",\t\"NAME\": \"销售、出租不动产不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"5\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"6\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"7\",\t\"NAME\": \"销售使用过的应税固定资产不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"8\",\t\"NAME\": \"其中：税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"9\",\t\"NAME\": \"免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"10\",\t\"NAME\": \"小微企业免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"11\",\t\"NAME\": \"未达起征点销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"12\",\t\"NAME\": \"其他免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"13\",\t\"NAME\": \"出口免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"14\",\t\"NAME\": \"出口免税销售额_税控器具开具的普通发票销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"15\",\t\"NAME\": \"本期应纳税额\",\t\"VALUE\": \"300000.0\"\t},\t{\t\"CODE\": \"16\",\t\"NAME\": \"本期应纳税额减征额\",\t\"VALUE\": \"10000.0\"\t},\t{\t\"CODE\": \"17\",\t\"NAME\": \"本期免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"18\",\t\"NAME\": \"其中：小微企业免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"19\",\t\"NAME\": \"未达起征点免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"20\",\t\"NAME\": \"应纳税额合计\",\t\"VALUE\": \"290000.0\"\t},\t{\t\"CODE\": \"21\",\t\"NAME\": \"本期预缴税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"22\",\t\"NAME\": \"本期应补（退）税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"23\",\t\"NAME\": \"应征增值税不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"24\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"25\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"26\",\t\"NAME\": \"销售、出租不动产不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"27\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"28\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"29\",\t\"NAME\": \"销售使用过的应税固定资产不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"30\",\t\"NAME\": \"其中：税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"31\",\t\"NAME\": \"免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"32\",\t\"NAME\": \"小微企业免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"33\",\t\"NAME\": \"未达起征点销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"34\",\t\"NAME\": \"其他免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"35\",\t\"NAME\": \"出口免税销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"36\",\t\"NAME\": \"出口免税销售额_税控器具开具的普通发票销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"37\",\t\"NAME\": \"本期应纳税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"38\",\t\"NAME\": \"本期应纳税额减征额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"39\",\t\"NAME\": \"本期免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"40\",\t\"NAME\": \"其中：小微企业免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"41\",\t\"NAME\": \"未达起征点免税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"42\",\t\"NAME\": \"应纳税额合计\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"43\",\t\"NAME\": \"本期预缴税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"44\",\t\"NAME\": \"本期应补（退）税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"45\",\t\"NAME\": \"应税货物劳务核定销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"46\",\t\"NAME\": \"应税货物劳务核定应纳税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"47\",\t\"NAME\": \"应税服务核定销售额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"48\",\t\"NAME\": \"应税服务核定应纳税额\",\t\"VALUE\": \"0.0\"\t} \t] }";
        JSONObject jsonObject = JSONObject.parseObject(json);
        Object object = jsonObject.get("LSXX");
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
            System.out.println("lsxxVos" + JSONObject.toJSONString(lsxxVos));
            ResultVo resultVo = LsjdxxVO.getLshdqcxx1(djxh, lsxxVos);
            System.out.println(JSONObject.toJSONString(resultVo.getValue()));
            resultVo = LsjdxxVO.getLshdqcxx(djxh, lsxxVos);
            System.out.println(JSONObject.toJSONString(resultVo.getValue()));
        } else {
            throw new NoSuchFieldException("数据解析失败！");
        }
    }

    @Test
    public void test1() {
        ZzsxgmGridlbVO zzsxgmGridlb2VO = new ZzsxgmGridlbVO();
        BeanMap beanMap = new BeanMap(zzsxgmGridlb2VO);
        System.out.println(JSONObject.toJSONString(beanMap));
        Iterator<Map.Entry<Object, Object>> iterator = beanMap.entryIterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            if (entry.getValue() instanceof Double) {
                double value = (Double) entry.getValue();
                if (value <0){

                }
            }
        }
    }

    @Test
    public void test2() {
        param.put("SFYCZB","Y");
        Object o = param.get("22222");

//        System.out.println(o);
        if (o == null){
            System.out.println("================22222===============");
        }
         o = param.get("SFYCZB");
//        System.out.println(o);
        if (o == null){
            System.out.println("================SFYCZB===============");
        }
    }

    @Test
    public  void  test3() throws NoSuchFieldException {
        String djxh = "test3";
        String json = "{ \t\"LSXX\": [\t{\t\"CODE\": \"1\",\t\"NAME\": \"应征增值税不含税销售额\",\t\"VALUE\": \"1\"\t},\t{\t\"CODE\": \"2\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"2\"\t},\t{\t\"CODE\": \"3\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"3\"\t},\t{\t\"CODE\": \"4\",\t\"NAME\": \"销售、出租不动产不含税销售额\",\t\"VALUE\": \"4\"\t},\t{\t\"CODE\": \"5\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"5\"\t},\t{\t\"CODE\": \"6\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"6\"\t},\t{\t\"CODE\": \"7\",\t\"NAME\": \"销售使用过的应税固定资产不含税销售额\",\t\"VALUE\": \"7\"\t},\t{\t\"CODE\": \"8\",\t\"NAME\": \"其中：税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"8\"\t},\t{\t\"CODE\": \"9\",\t\"NAME\": \"免税销售额\",\t\"VALUE\": \"9\"\t},\t{\t\"CODE\": \"10\",\t\"NAME\": \"小微企业免税销售额\",\t\"VALUE\": \"10\"\t},\t{\t\"CODE\": \"11\",\t\"NAME\": \"未达起征点销售额\",\t\"VALUE\": \"11\"\t},\t{\t\"CODE\": \"12\",\t\"NAME\": \"其他免税销售额\",\t\"VALUE\": \"12\"\t},\t{\t\"CODE\": \"13\",\t\"NAME\": \"出口免税销售额\",\t\"VALUE\": \"13\"\t},\t{\t\"CODE\": \"14\",\t\"NAME\": \"出口免税销售额_税控器具开具的普通发票销售额\",\t\"VALUE\": \"14\"\t},\t{\t\"CODE\": \"15\",\t\"NAME\": \"本期应纳税额\",\t\"VALUE\": \"15\"\t},\t{\t\"CODE\": \"16\",\t\"NAME\": \"本期应纳税额减征额\",\t\"VALUE\": \"16\"\t},\t{\t\"CODE\": \"17\",\t\"NAME\": \"本期免税额\",\t\"VALUE\": \"17\"\t},\t{\t\"CODE\": \"18\",\t\"NAME\": \"其中：小微企业免税额\",\t\"VALUE\": \"18\"\t},\t{\t\"CODE\": \"19\",\t\"NAME\": \"未达起征点免税额\",\t\"VALUE\": \"19\"\t},\t{\t\"CODE\": \"20\",\t\"NAME\": \"应纳税额合计\",\t\"VALUE\": \"20\"\t},\t{\t\"CODE\": \"21\",\t\"NAME\": \"本期预缴税额\",\t\"VALUE\": \"21\"\t},\t{\t\"CODE\": \"22\",\t\"NAME\": \"本期应补（退）税额\",\t\"VALUE\": \"22\"\t},\t{\t\"CODE\": \"23\",\t\"NAME\": \"应征增值税不含税销售额\",\t\"VALUE\": \"23\"\t},\t{\t\"CODE\": \"24\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"24\"\t},\t{\t\"CODE\": \"25\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"25\"\t},\t{\t\"CODE\": \"26\",\t\"NAME\": \"销售、出租不动产不含税销售额\",\t\"VALUE\": \"26\"\t},\t{\t\"CODE\": \"27\",\t\"NAME\": \"税务机关代开的增值税专用发票不含税销售额\",\t\"VALUE\": \"27\"\t},\t{\t\"CODE\": \"28\",\t\"NAME\": \"税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"28\"\t},\t{\t\"CODE\": \"29\",\t\"NAME\": \"销售使用过的应税固定资产不含税销售额\",\t\"VALUE\": \"29\"\t},\t{\t\"CODE\": \"30\",\t\"NAME\": \"其中：税控器具开具的普通发票不含税销售额\",\t\"VALUE\": \"30\"\t},\t{\t\"CODE\": \"31\",\t\"NAME\": \"免税销售额\",\t\"VALUE\": \"31\"\t},\t{\t\"CODE\": \"32\",\t\"NAME\": \"小微企业免税销售额\",\t\"VALUE\": \"32\"\t},\t{\t\"CODE\": \"33\",\t\"NAME\": \"未达起征点销售额\",\t\"VALUE\": \"33\"\t},\t{\t\"CODE\": \"34\",\t\"NAME\": \"其他免税销售额\",\t\"VALUE\": \"34\"\t},\t{\t\"CODE\": \"35\",\t\"NAME\": \"出口免税销售额\",\t\"VALUE\": \"35\"\t},\t{\t\"CODE\": \"36\",\t\"NAME\": \"出口免税销售额_税控器具开具的普通发票销售额\",\t\"VALUE\": \"36\"\t},\t{\t\"CODE\": \"37\",\t\"NAME\": \"本期应纳税额\",\t\"VALUE\": \"37\"\t},\t{\t\"CODE\": \"38\",\t\"NAME\": \"本期应纳税额减征额\",\t\"VALUE\": \"38\"\t},\t{\t\"CODE\": \"39\",\t\"NAME\": \"本期免税额\",\t\"VALUE\": \"39\"\t},\t{\t\"CODE\": \"40\",\t\"NAME\": \"其中：小微企业免税额\",\t\"VALUE\": \"40\"\t},\t{\t\"CODE\": \"41\",\t\"NAME\": \"未达起征点免税额\",\t\"VALUE\": \"41\"\t},\t{\t\"CODE\": \"42\",\t\"NAME\": \"应纳税额合计\",\t\"VALUE\": \"42\"\t},\t{\t\"CODE\": \"43\",\t\"NAME\": \"本期预缴税额\",\t\"VALUE\": \"0.0\"\t},\t{\t\"CODE\": \"44\",\t\"NAME\": \"本期应补（退）税额\",\t\"VALUE\": \"44\"\t},\t{\t\"CODE\": \"45\",\t\"NAME\": \"应税货物劳务核定销售额\",\t\"VALUE\": \"45\"\t},\t{\t\"CODE\": \"46\",\t\"NAME\": \"应税货物劳务核定应纳税额\",\t\"VALUE\": \"46\"\t},\t{\t\"CODE\": \"47\",\t\"NAME\": \"应税服务核定销售额\",\t\"VALUE\": \"47\"\t},\t{\t\"CODE\": \"48\",\t\"NAME\": \"应税服务核定应纳税额\",\t\"VALUE\": \"48\"\t} \t] }";

        JSONObject jsonObject = JSONObject.parseObject(json);
        Object object = jsonObject.get("LSXX");
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
            System.out.println("lsxxVos" + JSONObject.toJSONString(lsxxVos));
            ResultVo resultVo = LsjdxxVO.getLshdqcxx1(djxh, lsxxVos);
            System.out.println(JSONObject.toJSONString(resultVo.getValue()));
            resultVo = LsjdxxVO.getLshdqcxx(djxh, lsxxVos);
            System.out.println(JSONObject.toJSONString(resultVo.getValue()));
        } else {
            throw new NoSuchFieldException("数据解析失败！");
        }
    }
    @Test
    public  void test4(){
        boolean[] booleans = new boolean[1];
        System.out.println(booleans);
      //  boolean bl = false;
       System.out.println(booleans.length);
        for (boolean aBoolean : booleans) {
            System.out.println(aBoolean);
        }
    }
}

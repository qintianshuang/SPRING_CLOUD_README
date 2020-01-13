package com.example.cloud.company.common.vo.xgm.xml;//package com.example.cloud.server.common.vo.xgm.xml;
//
//import com.example.cloud.server.common.vo.xgm.hdxx.SBZzsxgmnsrqcsxxVO;
//import com.example.cloud.server.common.vo.xgm.hdxx.SBZzsxgmnsrqtxxVO;
//import com.example.cloud.server.common.vo.xgm.sbxx.sjgt3.zzsxgm.*;
//
//import javax.xml.bind.annotation.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(
//        name = "HXZGSB00789Response",
//        propOrder = {"sbxxGrid", "jmxxGrid", "yjxxGrid", "zzsxgmnsrqcsxxGrid", "sbZzsxgmnsrqtxxVO", "zzssyyxgmnsrySbSbbdxxVO"}
//)
//public class HXZGSB00789Response111 extends TaxDoc {
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response111.SbxxGrid sbxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response111.JmxxGrid jmxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response111.YjxxGrid yjxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response111.ZzsxgmnsrqcsxxGrid zzsxgmnsrqcsxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected SBZzsxgmnsrqtxxVO sbZzsxgmnsrqtxxVO;
//    @XmlElement(
//            required = true
//    )
//    protected Zzssyyxgmnsrywbw zzssyyxgmnsrySbSbbdxxVO;
//
//    public HXZGSB00789Response111() {
//    }
//
//    public HXZGSB00789Response111.SbxxGrid getSbxxGrid() {
//        return this.sbxxGrid;
//    }
//
//    public void setSbxxGrid(HXZGSB00789Response111.SbxxGrid value) {
//        this.sbxxGrid = value;
//    }
//
//    public HXZGSB00789Response111.JmxxGrid getJmxxGrid() {
//        return this.jmxxGrid;
//    }
//
//    public void setJmxxGrid(HXZGSB00789Response111.JmxxGrid value) {
//        this.jmxxGrid = value;
//    }
//
//    public HXZGSB00789Response111.YjxxGrid getYjxxGrid() {
//        return this.yjxxGrid;
//    }
//
//    public void setYjxxGrid(HXZGSB00789Response111.YjxxGrid value) {
//        this.yjxxGrid = value;
//    }
//
//    public HXZGSB00789Response111.ZzsxgmnsrqcsxxGrid getZzsxgmnsrqcsxxGrid() {
//        return this.zzsxgmnsrqcsxxGrid;
//    }
//
//    public void setZzsxgmnsrqcsxxGrid(HXZGSB00789Response111.ZzsxgmnsrqcsxxGrid value) {
//        this.zzsxgmnsrqcsxxGrid = value;
//    }
//
//    public SBZzsxgmnsrqtxxVO getSbZzsxgmnsrqtxxVO() {
//        return this.sbZzsxgmnsrqtxxVO;
//    }
//
//    public void setSbZzsxgmnsrqtxxVO(SBZzsxgmnsrqtxxVO value) {
//        this.sbZzsxgmnsrqtxxVO = value;
//    }
//
//    public Zzssyyxgmnsrywbw getZzssyyxgmnsrySbSbbdxxVO() {
//        return this.zzssyyxgmnsrySbSbbdxxVO;
//    }
//
//    public void setZzssyyxgmnsrySbSbbdxxVO(Zzssyyxgmnsrywbw value) {
//        this.zzssyyxgmnsrySbSbbdxxVO = value;
//    }
//
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(
//            name = "",
//            propOrder = {"zzsxgmnsrqcsxxGridlb"}
//    )
//    public static class ZzsxgmnsrqcsxxGrid {
//        protected List<SBZzsxgmnsrqcsxxVO> zzsxgmnsrqcsxxGridlb;
//
//        public ZzsxgmnsrqcsxxGrid() {
//        }
//
//        public List<SBZzsxgmnsrqcsxxVO> getZzsxgmnsrqcsxxGridlb() {
//            if (this.zzsxgmnsrqcsxxGridlb == null) {
//                this.zzsxgmnsrqcsxxGridlb = new ArrayList();
//            }
//
//            return this.zzsxgmnsrqcsxxGridlb;
//        }
//    }
//
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(
//            name = "",
//            propOrder = {"yjxxGridlb"}
//    )
//    public static class YjxxGrid {
//        protected List<SBYjxxJhVO> yjxxGridlb;
//
//        public YjxxGrid() {
//        }
//
//        public List<SBYjxxJhVO> getYjxxGridlb() {
//            if (this.yjxxGridlb == null) {
//                this.yjxxGridlb = new ArrayList();
//            }
//
//            return this.yjxxGridlb;
//        }
//    }
//
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(
//            name = "",
//            propOrder = {"sbxxGridlb"}
//    )
//    public static class SbxxGrid {
//        protected List<SBSbxxJhVO> sbxxGridlb;
//
//        public SbxxGrid() {
//        }
//
//        public List<SBSbxxJhVO> getSbxxGridlb() {
//            if (this.sbxxGridlb == null) {
//                this.sbxxGridlb = new ArrayList();
//            }
//
//            return this.sbxxGridlb;
//        }
//    }
//
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(
//            name = "",
//            propOrder = {"jmxxGridlb"}
//    )
//    public static class JmxxGrid {
//        protected List<SBJmxxJhVO> jmxxGridlb;
//
//        public JmxxGrid() {
//        }
//
//        public List<SBJmxxJhVO> getJmxxGridlb() {
//            if (this.jmxxGridlb == null) {
//                this.jmxxGridlb = new ArrayList();
//            }
//
//            return this.jmxxGridlb;
//        }
//    }
//}
//

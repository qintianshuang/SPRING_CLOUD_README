package com.example.cloud.company.common.vo.xgm.xml;

import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBYjxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.TaxDoc;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HXZGSB00789Response",
        propOrder = { "yjxxGrid"}
)
public class HXZGSB00789Response extends TaxDoc {
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response.SbxxGrid sbxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response.JmxxGrid jmxxGrid;
    @XmlElement(
            required = true
    )
    protected YjxxGrid yjxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected HXZGSB00789Response.ZzsxgmnsrqcsxxGrid zzsxgmnsrqcsxxGrid;
//    @XmlElement(
//            required = true
//    )
//    protected SBZzsxgmnsrqtxxVO sbZzsxgmnsrqtxxVO;
//    @XmlElement(
//            required = true
//    )
//    protected Zzssyyxgmnsrywbw zzssyyxgmnsrySbSbbdxxVO;

    public HXZGSB00789Response() {
    }

//    public HXZGSB00789Response.SbxxGrid getSbxxGrid() {
//        return this.sbxxGrid;
//    }
//
//    public void setSbxxGrid(HXZGSB00789Response.SbxxGrid value) {
//        this.sbxxGrid = value;
//    }
//
//    public HXZGSB00789Response.JmxxGrid getJmxxGrid() {
//        return this.jmxxGrid;
//    }
//
//    public void setJmxxGrid(HXZGSB00789Response.JmxxGrid value) {
//        this.jmxxGrid = value;
//    }

    public YjxxGrid getYjxxGrid() {
        return this.yjxxGrid;
    }

    public void setYjxxGrid(YjxxGrid value) {
        this.yjxxGrid = value;
    }
//
//    public HXZGSB00789Response.ZzsxgmnsrqcsxxGrid getZzsxgmnsrqcsxxGrid() {
//        return this.zzsxgmnsrqcsxxGrid;
//    }
//
//    public void setZzsxgmnsrqcsxxGrid(HXZGSB00789Response.ZzsxgmnsrqcsxxGrid value) {
//        this.zzsxgmnsrqcsxxGrid = value;
//    }

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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "YjxxGrid",
            propOrder = {"yjxxGridlb"}
    )
    public static class YjxxGrid {
        protected List<SBYjxxJhVO> yjxxGridlb;

        public YjxxGrid() {
        }

        public List<SBYjxxJhVO> getYjxxGridlb() {
            if (this.yjxxGridlb == null) {
                this.yjxxGridlb = new ArrayList();
            }

            return this.yjxxGridlb;
        }

        public void setYjxxGridlb(List<SBYjxxJhVO> yjxxGridlb) {
            this.yjxxGridlb = yjxxGridlb;
        }
    }

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
}


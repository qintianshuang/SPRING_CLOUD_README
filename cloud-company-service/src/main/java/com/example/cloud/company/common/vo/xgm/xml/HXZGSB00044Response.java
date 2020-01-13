package com.example.cloud.company.common.vo.xgm.xml;

import com.example.cloud.company.common.vo.xgm.hdxx.SBZzsjmssbmxbjsxmqcsxxVO;
import com.example.cloud.company.common.vo.xgm.hdxx.SBZzsxgmnsrqcsxxVO;
import com.example.cloud.company.common.vo.xgm.hdxx.SBZzsxgmnsrqtxxVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBJmxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBSbxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBYjxxJhVO;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.TaxDoc;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(
        name = "taxML"
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HXZGSB00044Response",
        propOrder = {"sbxxGrid", "jmxxGrid", "yjxxGrid", "zzsxgmnsrqcsxxGrid", "sbZzsxgmnsrqtxxVO", "sbZzsjmssbmxbjsxmqcsxxGrid"}
)
public class HXZGSB00044Response extends TaxDoc {
    @XmlElement(
            required = true
    )
    protected SbxxGrid sbxxGrid;
    @XmlElement(
            required = true
    )
    protected JmxxGrid jmxxGrid;
    @XmlElement(
            required = true
    )
    protected YjxxGrid yjxxGrid;
    @XmlElement(
            required = true
    )
    protected ZzsxgmnsrqcsxxGrid zzsxgmnsrqcsxxGrid;
    @XmlElement(
            required = true
    )
    protected SBZzsxgmnsrqtxxVO sbZzsxgmnsrqtxxVO;
    @XmlElement(
            required = true
    )
    protected SbZzsjmssbmxbjsxmqcsxxGrid sbZzsjmssbmxbjsxmqcsxxGrid;

    public HXZGSB00044Response() {
    }

    public SbxxGrid getSbxxGrid() {
        return this.sbxxGrid;
    }

    public void setSbxxGrid(SbxxGrid value) {
        this.sbxxGrid = value;
    }

    public JmxxGrid getJmxxGrid() {
        return this.jmxxGrid;
    }

    public void setJmxxGrid(JmxxGrid value) {
        this.jmxxGrid = value;
    }

    public YjxxGrid getYjxxGrid() {
        return this.yjxxGrid;
    }

    public void setYjxxGrid(YjxxGrid value) {
        this.yjxxGrid = value;
    }

    public ZzsxgmnsrqcsxxGrid getZzsxgmnsrqcsxxGrid() {
        return this.zzsxgmnsrqcsxxGrid;
    }

    public void setZzsxgmnsrqcsxxGrid(ZzsxgmnsrqcsxxGrid value) {
        this.zzsxgmnsrqcsxxGrid = value;
    }

    public SBZzsxgmnsrqtxxVO getSbZzsxgmnsrqtxxVO() {
        return this.sbZzsxgmnsrqtxxVO;
    }

    public void setSbZzsxgmnsrqtxxVO(SBZzsxgmnsrqtxxVO value) {
        this.sbZzsxgmnsrqtxxVO = value;
    }

    public SbZzsjmssbmxbjsxmqcsxxGrid getSbZzsjmssbmxbjsxmqcsxxGrid() {
        return this.sbZzsjmssbmxbjsxmqcsxxGrid;
    }

    public void setSbZzsjmssbmxbjsxmqcsxxGrid(SbZzsjmssbmxbjsxmqcsxxGrid value) {
        this.sbZzsjmssbmxbjsxmqcsxxGrid = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zzsxgmnsrqcsxxGridlb"}
    )
    public static class ZzsxgmnsrqcsxxGrid {
        protected List<SBZzsxgmnsrqcsxxVO> zzsxgmnsrqcsxxGridlb;

        public ZzsxgmnsrqcsxxGrid() {
        }

        public List<SBZzsxgmnsrqcsxxVO> getZzsxgmnsrqcsxxGridlb() {
            if (this.zzsxgmnsrqcsxxGridlb == null) {
                this.zzsxgmnsrqcsxxGridlb = new ArrayList();
            }

            return this.zzsxgmnsrqcsxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"yjxxGridlb"}
    )
    public static class YjxxGrid {
        protected List<SBYjxxJhVO> yjxxGridlb;

        public YjxxGrid() {
        }

        public List<SBYjxxJhVO> getYjxxGridlb() {
            if (this.yjxxGridlb == null) {
                this.yjxxGridlb = new ArrayList<>();
            }

            return this.yjxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"sbxxGridlb"}
    )
    public static class SbxxGrid {
        protected List<SBSbxxJhVO> sbxxGridlb;

        public SbxxGrid() {
        }

        public List<SBSbxxJhVO> getSbxxGridlb() {
            if (this.sbxxGridlb == null) {
                this.sbxxGridlb = new ArrayList();
            }

            return this.sbxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"sbZzsjmssbmxbjsxmqcsxxGridlb"}
    )
    public static class SbZzsjmssbmxbjsxmqcsxxGrid {
        protected List<SBZzsjmssbmxbjsxmqcsxxVO> sbZzsjmssbmxbjsxmqcsxxGridlb;

        public SbZzsjmssbmxbjsxmqcsxxGrid() {
        }

        public List<SBZzsjmssbmxbjsxmqcsxxVO> getSbZzsjmssbmxbjsxmqcsxxGridlb() {
            if (this.sbZzsjmssbmxbjsxmqcsxxGridlb == null) {
                this.sbZzsjmssbmxbjsxmqcsxxGridlb = new ArrayList();
            }

            return this.sbZzsjmssbmxbjsxmqcsxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"jmxxGridlb"}
    )
    public static class JmxxGrid {
        protected List<SBJmxxJhVO> jmxxGridlb;

        public JmxxGrid() {
        }

        public List<SBJmxxJhVO> getJmxxGridlb() {
            if (this.jmxxGridlb == null) {
                this.jmxxGridlb = new ArrayList();
            }

            return this.jmxxGridlb;
        }
    }
}

package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DkdjGrid",
        propOrder = {"dkdjZsxms", "dkdjZspms"}
)
public class DkdjGrid {
    @XmlElement(
            name = "DKDJZSXMS",
            required = true
    )
    private DKDJZSXMS dkdjZsxms;
    @XmlElement(
            name = "DKDJZSPMS",
            required = true
    )
    private DKDJZSPMS dkdjZspms;

    public DkdjGrid() {
    }

    public DKDJZSXMS getDkdjZsxms() {
        return this.dkdjZsxms;
    }

    public void setDkdjZsxms(DKDJZSXMS dkdjZsxms) {
        this.dkdjZsxms = dkdjZsxms;
    }

    public DKDJZSPMS getDkdjZspms() {
        return this.dkdjZspms;
    }

    public void setDkdjZspms(DKDJZSPMS dkdjZspms) {
        this.dkdjZspms = dkdjZspms;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zspmList"}
    )
    public static class DKDJZSPMS {
        @XmlElement(
                name = "ZSPM",
                required = true
        )
        protected List<DkdjZspmVo> zspmList;

        public DKDJZSPMS() {
        }

        public List<DkdjZspmVo> getZspmList() {
            if (this.zspmList == null) {
                this.zspmList = new ArrayList();
            }

            return this.zspmList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zsxmList"}
    )
    public static class DKDJZSXMS {
        @XmlElement(
                name = "ZSXM",
                required = true
        )
        protected List<DkdjZsxmVo> zsxmList;

        public DKDJZSXMS() {
        }

        public List<DkdjZsxmVo> getZsxmList() {
            if (this.zsxmList == null) {
                this.zsxmList = new ArrayList();
            }

            return this.zsxmList;
        }
    }
}

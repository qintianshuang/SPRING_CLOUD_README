package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"ncpzjxshdb", "ncphwsthdb"}
)
@XmlRootElement(
        name = "CPMCS"
)
public class CPMCS {
    @XmlElement(
            name = "NCPZJXSHDB",
            required = true
    )
    protected NCPZJXSHDB ncpzjxshdb;
    @XmlElement(
            name = "NCPHWSTHDB",
            required = true
    )
    protected NCPHWSTHDB ncphwsthdb;

    public CPMCS() {
    }

    public NCPZJXSHDB getNCPZJXSHDB() {
        return this.ncpzjxshdb;
    }

    public void setNCPZJXSHDB(NCPZJXSHDB value) {
        this.ncpzjxshdb = value;
    }

    public NCPHWSTHDB getNCPHWSTHDB() {
        return this.ncphwsthdb;
    }

    public void setNCPHWSTHDB(NCPHWSTHDB value) {
        this.ncphwsthdb = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"cpmc"}
    )
    public static class NCPZJXSHDB {
        @XmlElement(
                name = "CPMC",
                required = true
        )
        protected List<String> cpmc;

        public NCPZJXSHDB() {
        }

        public List<String> getCPMC() {
            if (this.cpmc == null) {
                this.cpmc = new ArrayList();
            }

            return this.cpmc;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"cpmc"}
    )
    public static class NCPHWSTHDB {
        @XmlElement(
                name = "CPMC",
                required = true
        )
        protected List<String> cpmc;

        public NCPHWSTHDB() {
        }

        public List<String> getCPMC() {
            if (this.cpmc == null) {
                this.cpmc = new ArrayList();
            }

            return this.cpmc;
        }
    }
}


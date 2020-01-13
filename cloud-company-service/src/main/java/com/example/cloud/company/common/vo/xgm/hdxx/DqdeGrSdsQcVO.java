package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"dqdeGrSdsQcxxGrid"}
)
public class DqdeGrSdsQcVO {
    @XmlElement(
            name = "DqdeGrSdsQcxxGrid",
            required = true
    )
    protected DqdeGrSdsQcxxGrid dqdeGrSdsQcxxGrid;

    public DqdeGrSdsQcVO() {
    }

    public DqdeGrSdsQcxxGrid getDqdeGrSdsQcxxGrid() {
        if (this.dqdeGrSdsQcxxGrid == null) {
            this.dqdeGrSdsQcxxGrid = new DqdeGrSdsQcxxGrid();
        }

        return this.dqdeGrSdsQcxxGrid;
    }

    public void setDqdeGrSdsQcxxGrid(DqdeGrSdsQcxxGrid value) {
        this.dqdeGrSdsQcxxGrid = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"dqdeGrSdsQcxxGridlb"}
    )
    public static class DqdeGrSdsQcxxGrid {
        @XmlElement(
                name = "DqdeGrSdsQcxxGridlb",
                required = true
        )
        protected List<DqdeGrSdsQcxxGridlb> dqdeGrSdsQcxxGridlb;

        public DqdeGrSdsQcxxGrid() {
        }

        public List<DqdeGrSdsQcxxGridlb> getDqdeGrSdsQcxxGridlb() {
            if (this.dqdeGrSdsQcxxGridlb == null) {
                this.dqdeGrSdsQcxxGridlb = new ArrayList();
            }

            return this.dqdeGrSdsQcxxGridlb;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = "",
                propOrder = {"dqdeGrSdsSbxx", "dqdeGrSdsHdJmxx", "dqdeGrSdsJmxx"}
        )
        public static class DqdeGrSdsQcxxGridlb {
            @XmlElement(
                    name = "DqdeGrSdsSbxx",
                    required = true
            )
            protected DqdeGrSdsSbxx dqdeGrSdsSbxx;
            @XmlElement(
                    name = "DqdeGrSdsHdJmxx",
                    required = true
            )
            protected DqdeGrSdsHdJmxx dqdeGrSdsHdJmxx;
            @XmlElement(
                    name = "DqdeGrSdsJmxx",
                    required = true
            )
            protected DqdeGrSdsJmxx dqdeGrSdsJmxx;

            public DqdeGrSdsQcxxGridlb() {
            }

            public DqdeGrSdsSbxx getDqdeGrSdsSbxx() {
                return this.dqdeGrSdsSbxx;
            }

            public void setDqdeGrSdsSbxx(DqdeGrSdsSbxx value) {
                this.dqdeGrSdsSbxx = value;
            }

            public DqdeGrSdsHdJmxx getDqdeGrSdsHdJmxx() {
                return this.dqdeGrSdsHdJmxx;
            }

            public void setDqdeGrSdsHdJmxx(DqdeGrSdsHdJmxx value) {
                this.dqdeGrSdsHdJmxx = value;
            }

            public DqdeGrSdsJmxx getDqdeGrSdsJmxx() {
                return this.dqdeGrSdsJmxx;
            }

            public void setDqdeGrSdsJmxx(DqdeGrSdsJmxx value) {
                this.dqdeGrSdsJmxx = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"zsxmDm", "zspmDm", "zszmDm", "ysx", "jsyj", "skssqq", "skssqz", "hdynsjye", "sl1", "ynse", "hdse", "jmse", "yjse", "zsxmMc", "zspmMc", "zszmMc", "yyts", "rdpzuuid", "jsbz1", "yssdl", "phjmxzDm", "phjmswsxdm", "phjmswsxmc", "phjzbl", "kce", "bqYjse"}
            )
            public static class DqdeGrSdsSbxx {
                @XmlElement(
                        required = true
                )
                protected String zsxmDm = "";
                @XmlElement(
                        required = true
                )
                protected String zspmDm = "";
                @XmlElement(
                        required = true
                )
                protected String zszmDm = "";
                @XmlElement(
                        required = true
                )
                protected String ysx = "";
                @XmlElement(
                        required = true
                )
                protected String jsyj = "";
                @XmlElement(
                        required = true
                )
                protected String skssqq = "";
                @XmlElement(
                        required = true
                )
                protected String skssqz = "";
                @XmlElement(
                        required = true
                )
                protected String hdynsjye = "";
                @XmlElement(
                        required = true
                )
                protected String sl1 = "";
                @XmlElement(
                        required = true
                )
                protected String ynse = "";
                @XmlElement(
                        required = true
                )
                protected String hdse = "";
                @XmlElement(
                        required = true
                )
                protected String jmse = "";
                @XmlElement(
                        required = true
                )
                protected String yjse = "";
                @XmlElement(
                        required = true
                )
                protected String bqYjse = "";
                @XmlElement(
                        required = true
                )
                protected String zsxmMc = "";
                @XmlElement(
                        required = true
                )
                protected String zspmMc = "";
                @XmlElement(
                        required = true
                )
                protected String zszmMc = "";
                @XmlElement(
                        required = true
                )
                protected String yyts = "";
                @XmlElement(
                        required = true
                )
                protected String rdpzuuid = "";
                @XmlElement(
                        required = true
                )
                protected String jsbz1;
                @XmlElement(
                        required = true
                )
                protected String yssdl;
                @XmlElement(
                        required = true
                )
                protected String phjmxzDm;
                @XmlElement(
                        required = true
                )
                protected String phjmswsxdm;
                @XmlElement(
                        required = true
                )
                protected String phjmswsxmc;
                @XmlElement(
                        required = true
                )
                protected String phjzbl;
                @XmlElement(
                        required = true
                )
                protected String kce;

                public DqdeGrSdsSbxx() {
                }

                public String getPhjmxzDm() {
                    return this.phjmxzDm;
                }

                public void setPhjmxzDm(String phjmxzDm) {
                    this.phjmxzDm = phjmxzDm;
                }

                public String getPhjmswsxdm() {
                    return this.phjmswsxdm;
                }

                public void setPhjmswsxdm(String phjmswsxdm) {
                    this.phjmswsxdm = phjmswsxdm;
                }

                public String getPhjmswsxmc() {
                    return this.phjmswsxmc;
                }

                public void setPhjmswsxmc(String phjmswsxmc) {
                    this.phjmswsxmc = phjmswsxmc;
                }

                public String getPhjzbl() {
                    return this.phjzbl;
                }

                public void setPhjzbl(String phjzbl) {
                    this.phjzbl = phjzbl;
                }

                public String getJsbz1() {
                    return this.jsbz1;
                }

                public void setJsbz1(String jsbz1) {
                    this.jsbz1 = jsbz1;
                }

                public String getYssdl() {
                    return this.yssdl;
                }

                public void setYssdl(String yssdl) {
                    this.yssdl = yssdl;
                }

                public String getYyts() {
                    return this.yyts;
                }

                public void setYyts(String yyts) {
                    this.yyts = yyts;
                }

                public String getRdpzuuid() {
                    return this.rdpzuuid;
                }

                public void setRdpzuuid(String rdpzuuid) {
                    this.rdpzuuid = rdpzuuid;
                }

                public String getKce() {
                    return this.kce;
                }

                public void setKce(String kce) {
                    this.kce = kce;
                }

                public String getZsxmDm() {
                    return this.zsxmDm;
                }

                public void setZsxmDm(String value) {
                    this.zsxmDm = value;
                }

                public String getZspmDm() {
                    return this.zspmDm;
                }

                public void setZspmDm(String value) {
                    this.zspmDm = value;
                }

                public String getZszmDm() {
                    return this.zszmDm;
                }

                public void setZszmDm(String value) {
                    this.zszmDm = value;
                }

                public String getYsx() {
                    return this.ysx;
                }

                public void setYsx(String value) {
                    this.ysx = value;
                }

                public String getJsyj() {
                    return this.jsyj;
                }

                public void setJsyj(String value) {
                    this.jsyj = value;
                }

                public String getSkssqq() {
                    return this.skssqq;
                }

                public void setSkssqq(String value) {
                    this.skssqq = value;
                }

                public String getSkssqz() {
                    return this.skssqz;
                }

                public void setSkssqz(String value) {
                    this.skssqz = value;
                }

                public String getHdynsjye() {
                    return this.hdynsjye;
                }

                public void setHdynsjye(String value) {
                    this.hdynsjye = value;
                }

                public String getSl1() {
                    return this.sl1;
                }

                public void setSl1(String value) {
                    this.sl1 = value;
                }

                public String getYnse() {
                    return this.ynse;
                }

                public void setYnse(String value) {
                    this.ynse = value;
                }

                public String getHdse() {
                    return this.hdse;
                }

                public void setHdse(String value) {
                    this.hdse = value;
                }

                public String getJmse() {
                    return this.jmse;
                }

                public void setJmse(String value) {
                    this.jmse = value;
                }

                public String getYjse() {
                    return this.yjse;
                }

                public void setYjse(String value) {
                    this.yjse = value;
                }

                public String getZsxmMc() {
                    return this.zsxmMc;
                }

                public void setZsxmMc(String value) {
                    this.zsxmMc = value;
                }

                public String getZspmMc() {
                    return this.zspmMc;
                }

                public void setZspmMc(String value) {
                    this.zspmMc = value;
                }

                public String getZszmMc() {
                    return this.zszmMc;
                }

                public void setZszmMc(String value) {
                    this.zszmMc = value;
                }

                public String getBqYjse() {
                    return this.bqYjse;
                }

                public void setBqYjse(String bqYjse) {
                    this.bqYjse = bqYjse;
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"dqdeGrSdsJmxxmx"}
            )
            public static class DqdeGrSdsJmxx {
                @XmlElement(
                        name = "DqdeGrSdsJmxxmx",
                        required = true
                )
                protected List<DqdeGrSdsJmxxmx> dqdeGrSdsJmxxmx;

                public DqdeGrSdsJmxx() {
                }

                public List<DqdeGrSdsJmxxmx> getDqdeGrSdsJmxxmx() {
                    if (this.dqdeGrSdsJmxxmx == null) {
                        this.dqdeGrSdsJmxxmx = new ArrayList();
                    }

                    return this.dqdeGrSdsJmxxmx;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(
                        name = "",
                        propOrder = {"jmxzDm", "jmxzMc", "swsxDm", "jmxmMc"}
                )
                public static class DqdeGrSdsJmxxmx {
                    @XmlElement(
                            required = true
                    )
                    protected String jmxzDm;
                    @XmlElement(
                            required = true
                    )
                    protected String jmxzMc;
                    @XmlElement(
                            required = true
                    )
                    protected String swsxDm;
                    @XmlElement(
                            required = true
                    )
                    protected String jmxmMc;

                    public DqdeGrSdsJmxxmx() {
                    }

                    public String getJmxzDm() {
                        return this.jmxzDm;
                    }

                    public void setJmxzDm(String value) {
                        this.jmxzDm = value;
                    }

                    public String getJmxzMc() {
                        return this.jmxzMc;
                    }

                    public void setJmxzMc(String value) {
                        this.jmxzMc = value;
                    }

                    public String getSwsxDm() {
                        return this.swsxDm;
                    }

                    public void setSwsxDm(String value) {
                        this.swsxDm = value;
                    }

                    public String getJmxmMc() {
                        return this.jmxmMc;
                    }

                    public void setJmxmMc(String value) {
                        this.jmxmMc = value;
                    }
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"dqdeGrSdsHdJmxxmx"}
            )
            public static class DqdeGrSdsHdJmxx {
                @XmlElement(
                        name = "DqdeGrSdsHdJmxxmx",
                        required = true
                )
                protected List<DqdeGrSdsHdJmxxmx> dqdeGrSdsHdJmxxmx;

                public DqdeGrSdsHdJmxx() {
                }

                public List<DqdeGrSdsHdJmxxmx> getDqdeGrSdsHdJmxxmx() {
                    if (this.dqdeGrSdsHdJmxxmx == null) {
                        this.dqdeGrSdsHdJmxxmx = new ArrayList();
                    }

                    return this.dqdeGrSdsHdJmxxmx;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(
                        name = "",
                        propOrder = {"zsxmDm", "ssjmxzhzDm"}
                )
                public static class DqdeGrSdsHdJmxxmx {
                    @XmlElement(
                            required = true
                    )
                    protected String zsxmDm;
                    @XmlElement(
                            required = true
                    )
                    protected String ssjmxzhzDm;

                    public DqdeGrSdsHdJmxxmx() {
                    }

                    public String getZsxmDm() {
                        return this.zsxmDm;
                    }

                    public void setZsxmDm(String value) {
                        this.zsxmDm = value;
                    }

                    public String getSsjmxzhzDm() {
                        return this.ssjmxzhzDm;
                    }

                    public void setSsjmxzhzDm(String value) {
                        this.ssjmxzhzDm = value;
                    }
                }
            }
        }
    }
}


package com.example.cloud.company.common.vo.xgm.hdxx;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NsrgrtsxxVo",
        propOrder = {"returncode", "returnmessage", "fzchjkxx", "zlrdybnsr", "yqwsbcxs", "wjskxxs", "wfwzxxs"}
)
public class NsrgrtsxxVo {
    @XmlElement(
            name = "RETURNCODE",
            required = true
    )
    protected String returncode = "";
    @XmlElement(
            name = "RETURNMESSAGE",
            required = true
    )
    protected String returnmessage = "";
    @XmlElement(
            name = "FZCHJKXX",
            required = true
    )
    protected FzchjkxxVo fzchjkxx;
    @XmlElement(
            name = "ZLRDYBNSR",
            required = true
    )
    protected ZlrdybnsrVo zlrdybnsr;
    @XmlElement(
            name = "YQWSBCXS",
            required = true
    )
    protected YQWSBCXS yqwsbcxs;
    @XmlElement(
            name = "WJSKXXS",
            required = true
    )
    protected WJSKXXS wjskxxs;
    @XmlElement(
            name = "WFWZXXS",
            required = true
    )
    protected WFWZXXS wfwzxxs;

    public NsrgrtsxxVo() {
    }

    public String getRETURNCODE() {
        return this.returncode;
    }

    public void setRETURNCODE(String value) {
        this.returncode = value;
    }

    public String getRETURNMESSAGE() {
        return this.returnmessage;
    }

    public void setRETURNMESSAGE(String value) {
        this.returnmessage = value;
    }

    public FzchjkxxVo getFZCHJKXX() {
        return this.fzchjkxx;
    }

    public void setFZCHJKXX(FzchjkxxVo value) {
        this.fzchjkxx = value;
    }

    public ZlrdybnsrVo getZLRDYBNSR() {
        return this.zlrdybnsr;
    }

    public void setZLRDYBNSR(ZlrdybnsrVo value) {
        this.zlrdybnsr = value;
    }

    public YQWSBCXS getYQWSBCXS() {
        return this.yqwsbcxs;
    }

    public void setYQWSBCXS(YQWSBCXS value) {
        this.yqwsbcxs = value;
    }

    public WJSKXXS getWJSKXXS() {
        return this.wjskxxs;
    }

    public void setWJSKXXS(WJSKXXS value) {
        this.wjskxxs = value;
    }

    public WFWZXXS getWFWZXXS() {
        return this.wfwzxxs;
    }

    public void setWFWZXXS(WFWZXXS value) {
        this.wfwzxxs = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"yqwsbcx"}
    )
    public static class YQWSBCXS {
        @XmlElement(
                name = "YQWSBCX",
                required = true
        )
        protected List<YqwsbcxVo> yqwsbcx;

        public YQWSBCXS() {
        }

        public List<YqwsbcxVo> getYQWSBCX() {
            if (this.yqwsbcx == null) {
                this.yqwsbcx = new ArrayList();
            }

            return this.yqwsbcx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"wjskxx"}
    )
    public static class WJSKXXS {
        @XmlElement(
                name = "WJSKXX",
                required = true
        )
        protected List<WjskxxVo> wjskxx;

        public WJSKXXS() {
        }

        public List<WjskxxVo> getWJSKXX() {
            if (this.wjskxx == null) {
                this.wjskxx = new ArrayList();
            }

            return this.wjskxx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"wfwzxx"}
    )
    public static class WFWZXXS {
        @XmlElement(
                name = "WFWZXX",
                required = true
        )
        protected List<WfwzxxVo> wfwzxx;

        public WFWZXXS() {
        }

        public List<WfwzxxVo> getWFWZXX() {
            if (this.wfwzxx == null) {
                this.wfwzxx = new ArrayList();
            }

            return this.wfwzxx;
        }
    }
}

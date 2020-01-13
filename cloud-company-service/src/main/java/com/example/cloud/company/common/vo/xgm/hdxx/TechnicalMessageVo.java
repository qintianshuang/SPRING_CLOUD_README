package com.example.cloud.company.common.vo.xgm.hdxx;


import com.example.cloud.company.common.vo.common.sb.HeadType;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"head", "body"}
)
@XmlRootElement(
        name = "service"
)
public class TechnicalMessageVo implements Serializable {
    @XmlElement(
            required = true
    )
    protected HeadType head;
    @XmlElement(
            required = true
    )
    protected String body;

    public TechnicalMessageVo() {
    }

    public HeadType getHead() {
        return this.head;
    }

    public void setHead(HeadType value) {
        this.head = value;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String value) {
        this.body = value;
    }
}


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
        propOrder = {"sbfDwhzHdxxDTO"}
)
public class SbfDwhzHdxxList {
    @XmlElement(
            name = "SbfDwhzHdxxDTO",
            required = true
    )
    protected List<SbfDwhzHdxxDTO> sbfDwhzHdxxDTO;

    public SbfDwhzHdxxList() {
    }

    public List<SbfDwhzHdxxDTO> getSbfDwhzHdxxDTO() {
        if (this.sbfDwhzHdxxDTO == null) {
            this.sbfDwhzHdxxDTO = new ArrayList();
        }

        return this.sbfDwhzHdxxDTO;
    }
}


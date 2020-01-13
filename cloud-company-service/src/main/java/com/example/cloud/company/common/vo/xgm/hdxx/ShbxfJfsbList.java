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
        propOrder = {"shbxfJfsbDTO"}
)
public class ShbxfJfsbList {
    @XmlElement(
            required = true
    )
    protected List<ShbxfJfsbDTO> shbxfJfsbDTO;

    public ShbxfJfsbList() {
    }

    public List<ShbxfJfsbDTO> getShbxfJfsbDTO() {
        if (this.shbxfJfsbDTO == null) {
            this.shbxfJfsbDTO = new ArrayList();
        }

        return this.shbxfJfsbDTO;
    }
}


package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"yjfxzbjzsbzGridlb"}
)
public class YjfxzbjzsbzGrid {
    protected List<YjfxzbjzsbzVO> yjfxzbjzsbzGridlb;

    public YjfxzbjzsbzGrid() {
    }

    public List<YjfxzbjzsbzVO> getYjfxzbjzsbzGridlb() {
        if (this.yjfxzbjzsbzGridlb == null) {
            this.yjfxzbjzsbzGridlb = new ArrayList();
        }

        return this.yjfxzbjzsbzGridlb;
    }
}


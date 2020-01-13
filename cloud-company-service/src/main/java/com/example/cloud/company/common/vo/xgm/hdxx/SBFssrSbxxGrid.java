package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SBFssrSbxxGrid",
        propOrder = {"fssrTysbGridlb", "nfssrTysbGridlb"}
)
public class SBFssrSbxxGrid {
    protected List<SBFssrTysbVO> fssrTysbGridlb;
    protected List<SBFssrTysbVO> nfssrTysbGridlb;

    public SBFssrSbxxGrid() {
    }

    public List<SBFssrTysbVO> getFssrTysbGridlb() {
        if (this.fssrTysbGridlb == null) {
            this.fssrTysbGridlb = new ArrayList();
        }

        return this.fssrTysbGridlb;
    }

    public List<SBFssrTysbVO> getNfssrTysbGridlb() {
        if (this.nfssrTysbGridlb == null) {
            this.nfssrTysbGridlb = new ArrayList();
        }

        return this.nfssrTysbGridlb;
    }
}


package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "sbcxsfcjyjbxxGridlb",
        propOrder = {"sbcxsfcjyjbxxGridlb"}
)
public class SBCXSFCJYJBXXGrid {
    @XmlElement(
            required = true
    )
    protected List<SBCXSFCJYJBXXGridlb> sbcxsfcjyjbxxGridlb;

    public SBCXSFCJYJBXXGrid() {
    }

    public void setCjjzsymxbGridlb(List<SBCXSFCJYJBXXGridlb> sbcxsfcjyjbxxGridlbs) {
        this.sbcxsfcjyjbxxGridlb = sbcxsfcjyjbxxGridlbs;
    }

    public List<SBCXSFCJYJBXXGridlb> getSbcxsfcjyjbxxGridlbs() {
        if (this.sbcxsfcjyjbxxGridlb == null) {
            this.sbcxsfcjyjbxxGridlb = new ArrayList();
        }

        return this.sbcxsfcjyjbxxGridlb;
    }
}

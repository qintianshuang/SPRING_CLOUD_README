package com.example.cloud.company.common.vo.xgm.hdxx;

import java.io.Serializable;

public class DetailFileVo implements Serializable {
    private String detailId;
    private byte[] detailFile;

    public DetailFileVo() {
    }

    public DetailFileVo(String detailId, byte[] detailFile) {
        this.detailFile = detailFile;
        this.detailId = detailId;
    }

    public String getDetailId() {
        return this.detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public byte[] getDetailFile() {
        return this.detailFile;
    }

    public void setDetailFile(byte[] detailFile) {
        this.detailFile = detailFile;
    }
}

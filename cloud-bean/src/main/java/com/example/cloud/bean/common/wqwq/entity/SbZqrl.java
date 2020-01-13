package com.example.cloud.bean.common.wqwq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author qts
 * @since 2020-01-06
 */
@TableName("SB_ZQRL")
public class SbZqrl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 征收项目代码
     */
    @TableField("ZSXM_DM")
    private String zsxmDm;

    /**
     * 征收品目代码
     */
    @TableField("ZSPM_DM")
    private String zspmDm;

    /**
     * 所属期起
     */
    @TableField("SKSSQQ")
    private LocalDateTime skssqq;

    /**
     * 所属期止
     */
    @TableField("SKSSQZ")
    private LocalDateTime skssqz;

    /**
     * 申报期限
     */
    @TableField("SBQX")
    private LocalDateTime sbqx;

    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }
    public String getZspmDm() {
        return zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }
    public LocalDateTime getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(LocalDateTime skssqq) {
        this.skssqq = skssqq;
    }
    public LocalDateTime getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(LocalDateTime skssqz) {
        this.skssqz = skssqz;
    }
    public LocalDateTime getSbqx() {
        return sbqx;
    }

    public void setSbqx(LocalDateTime sbqx) {
        this.sbqx = sbqx;
    }

    @Override
    public String toString() {
        return "SbZqrl{" +
            "zsxmDm=" + zsxmDm +
            ", zspmDm=" + zspmDm +
            ", skssqq=" + skssqq +
            ", skssqz=" + skssqz +
            ", sbqx=" + sbqx +
        "}";
    }
}

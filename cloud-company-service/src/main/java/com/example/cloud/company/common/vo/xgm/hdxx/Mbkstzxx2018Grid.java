package com.example.cloud.company.common.vo.xgm.hdxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Mbkstzxx2018Grid",
        propOrder = {"mbkstzGridlb"}
)
public class Mbkstzxx2018Grid {
    protected List<MbkstzGridlb> mbkstzGridlb;

    public Mbkstzxx2018Grid() {
    }

    public List<MbkstzGridlb> getMbkstzGridlb() {
        return this.mbkstzGridlb;
    }

    public void setMbkstzGridlb(List<MbkstzGridlb> mbkstzGridlb) {
        this.mbkstzGridlb = mbkstzGridlb;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "MbkstzGridlb",
            propOrder = {"mbkstzuuid", "djxh", "pzxh", "xh", "xmmc", "nd", "zcxbqnd", "kshylje", "hbflqyzrkmbkse", "yqndhbflzrzclj", "kmbdsde", "kmbdsdeSn", "yqndymbksehj", "yqndymbksehjSn", "yqndjzdkmbkye", "yqndjzdkmbkyeSn", "flzckse", "hbqyzrkse", "hbqyzrkseSn", "qysdsmbksqylxDm", "dndmbdkse", "dndmbdkseZSn", "dndmbdkseSn", "bnjnmbyjndksje", "bnjnmbyjndksjeSn", "bnjwmbyjndksje", "bnjwmbyjndksjeSn", "kjzwmbwdksje", "kjzwmbwdksjeSn", "ybndjnsdembdyqndkse", "ybndjwsdembdyqndkse", "yymbjnksze", "djbnjnks", "mbyqndksdje", "kjzyhndmbdksehj", "tzyy"}
    )
    public static class MbkstzGridlb {
        protected String mbkstzuuid;
        protected String djxh;
        protected String pzxh;
        protected int xh;
        protected String xmmc;
        protected String nd;
        protected String zcxbqnd;
        protected double kshylje;
        protected double hbflqyzrkmbkse;
        protected double yqndhbflzrzclj;
        protected double kmbdsde;
        protected double kmbdsdeSn;
        protected double yqndymbksehj;
        protected double yqndymbksehjSn;
        protected double yqndjzdkmbkye;
        protected double yqndjzdkmbkyeSn;
        protected double flzckse;
        protected double hbqyzrkse;
        protected double hbqyzrkseSn;
        protected String qysdsmbksqylxDm;
        protected double dndmbdkse;
        protected double dndmbdkseZSn;
        protected double dndmbdkseSn;
        protected double bnjnmbyjndksje;
        protected double bnjnmbyjndksjeSn;
        protected double bnjwmbyjndksje;
        protected double bnjwmbyjndksjeSn;
        protected double kjzwmbwdksje;
        protected double kjzwmbwdksjeSn;
        protected double ybndjnsdembdyqndkse;
        protected double ybndjwsdembdyqndkse;
        protected Double yymbjnksze;
        protected Double djbnjnks;
        protected Double mbyqndksdje;
        protected Double kjzyhndmbdksehj;
        protected String tzyy;

        public MbkstzGridlb() {
        }

        public String getMbkstzuuid() {
            return this.mbkstzuuid;
        }

        public void setMbkstzuuid(String mbkstzuuid) {
            this.mbkstzuuid = mbkstzuuid;
        }

        public String getDjxh() {
            return this.djxh;
        }

        public void setDjxh(String djxh) {
            this.djxh = djxh;
        }

        public String getPzxh() {
            return this.pzxh;
        }

        public void setPzxh(String pzxh) {
            this.pzxh = pzxh;
        }

        public int getXh() {
            return this.xh;
        }

        public void setXh(int xh) {
            this.xh = xh;
        }

        public String getXmmc() {
            return this.xmmc;
        }

        public void setXmmc(String xmmc) {
            this.xmmc = xmmc;
        }

        public String getNd() {
            return this.nd;
        }

        public void setNd(String nd) {
            this.nd = nd;
        }

        public String getZcxbqnd() {
            return this.zcxbqnd;
        }

        public void setZcxbqnd(String zcxbqnd) {
            this.zcxbqnd = zcxbqnd;
        }

        public double getKshylje() {
            return this.kshylje;
        }

        public void setKshylje(double kshylje) {
            this.kshylje = kshylje;
        }

        public double getHbflqyzrkmbkse() {
            return this.hbflqyzrkmbkse;
        }

        public void setHbflqyzrkmbkse(double hbflqyzrkmbkse) {
            this.hbflqyzrkmbkse = hbflqyzrkmbkse;
        }

        public double getYqndhbflzrzclj() {
            return this.yqndhbflzrzclj;
        }

        public void setYqndhbflzrzclj(double yqndhbflzrzclj) {
            this.yqndhbflzrzclj = yqndhbflzrzclj;
        }

        public double getKmbdsde() {
            return this.kmbdsde;
        }

        public void setKmbdsde(double kmbdsde) {
            this.kmbdsde = kmbdsde;
        }

        public double getKmbdsdeSn() {
            return this.kmbdsdeSn;
        }

        public void setKmbdsdeSn(double kmbdsdeSn) {
            this.kmbdsdeSn = kmbdsdeSn;
        }

        public double getYqndymbksehj() {
            return this.yqndymbksehj;
        }

        public void setYqndymbksehj(double yqndymbksehj) {
            this.yqndymbksehj = yqndymbksehj;
        }

        public double getYqndymbksehjSn() {
            return this.yqndymbksehjSn;
        }

        public void setYqndymbksehjSn(double yqndymbksehjSn) {
            this.yqndymbksehjSn = yqndymbksehjSn;
        }

        public double getYqndjzdkmbkye() {
            return this.yqndjzdkmbkye;
        }

        public void setYqndjzdkmbkye(double yqndjzdkmbkye) {
            this.yqndjzdkmbkye = yqndjzdkmbkye;
        }

        public double getYqndjzdkmbkyeSn() {
            return this.yqndjzdkmbkyeSn;
        }

        public void setYqndjzdkmbkyeSn(double yqndjzdkmbkyeSn) {
            this.yqndjzdkmbkyeSn = yqndjzdkmbkyeSn;
        }

        public double getFlzckse() {
            return this.flzckse;
        }

        public void setFlzckse(double flzckse) {
            this.flzckse = flzckse;
        }

        public double getHbqyzrkse() {
            return this.hbqyzrkse;
        }

        public void setHbqyzrkse(double hbqyzrkse) {
            this.hbqyzrkse = hbqyzrkse;
        }

        public double getHbqyzrkseSn() {
            return this.hbqyzrkseSn;
        }

        public void setHbqyzrkseSn(double hbqyzrkseSn) {
            this.hbqyzrkseSn = hbqyzrkseSn;
        }

        public String getQysdsmbksqylxDm() {
            return this.qysdsmbksqylxDm;
        }

        public void setQysdsmbksqylxDm(String qysdsmbksqylxDm) {
            this.qysdsmbksqylxDm = qysdsmbksqylxDm;
        }

        public double getDndmbdkse() {
            return this.dndmbdkse;
        }

        public void setDndmbdkse(double dndmbdkse) {
            this.dndmbdkse = dndmbdkse;
        }

        public double getDndmbdkseZSn() {
            return this.dndmbdkseZSn;
        }

        public void setDndmbdkseZSn(double dndmbdkseZSn) {
            this.dndmbdkseZSn = dndmbdkseZSn;
        }

        public double getDndmbdkseSn() {
            return this.dndmbdkseSn;
        }

        public void setDndmbdkseSn(double dndmbdkseSn) {
            this.dndmbdkseSn = dndmbdkseSn;
        }

        public double getBnjnmbyjndksje() {
            return this.bnjnmbyjndksje;
        }

        public void setBnjnmbyjndksje(double bnjnmbyjndksje) {
            this.bnjnmbyjndksje = bnjnmbyjndksje;
        }

        public double getBnjnmbyjndksjeSn() {
            return this.bnjnmbyjndksjeSn;
        }

        public void setBnjnmbyjndksjeSn(double bnjnmbyjndksjeSn) {
            this.bnjnmbyjndksjeSn = bnjnmbyjndksjeSn;
        }

        public double getBnjwmbyjndksje() {
            return this.bnjwmbyjndksje;
        }

        public void setBnjwmbyjndksje(double bnjwmbyjndksje) {
            this.bnjwmbyjndksje = bnjwmbyjndksje;
        }

        public double getBnjwmbyjndksjeSn() {
            return this.bnjwmbyjndksjeSn;
        }

        public void setBnjwmbyjndksjeSn(double bnjwmbyjndksjeSn) {
            this.bnjwmbyjndksjeSn = bnjwmbyjndksjeSn;
        }

        public double getKjzwmbwdksje() {
            return this.kjzwmbwdksje;
        }

        public void setKjzwmbwdksje(double kjzwmbwdksje) {
            this.kjzwmbwdksje = kjzwmbwdksje;
        }

        public double getKjzwmbwdksjeSn() {
            return this.kjzwmbwdksjeSn;
        }

        public void setKjzwmbwdksjeSn(double kjzwmbwdksjeSn) {
            this.kjzwmbwdksjeSn = kjzwmbwdksjeSn;
        }

        public double getYbndjnsdembdyqndkse() {
            return this.ybndjnsdembdyqndkse;
        }

        public void setYbndjnsdembdyqndkse(double ybndjnsdembdyqndkse) {
            this.ybndjnsdembdyqndkse = ybndjnsdembdyqndkse;
        }

        public double getYbndjwsdembdyqndkse() {
            return this.ybndjwsdembdyqndkse;
        }

        public void setYbndjwsdembdyqndkse(double ybndjwsdembdyqndkse) {
            this.ybndjwsdembdyqndkse = ybndjwsdembdyqndkse;
        }

        public Double getYymbjnksze() {
            return this.yymbjnksze;
        }

        public void setYymbjnksze(Double yymbjnksze) {
            this.yymbjnksze = yymbjnksze;
        }

        public Double getDjbnjnks() {
            return this.djbnjnks;
        }

        public void setDjbnjnks(Double djbnjnks) {
            this.djbnjnks = djbnjnks;
        }

        public Double getMbyqndksdje() {
            return this.mbyqndksdje;
        }

        public void setMbyqndksdje(Double mbyqndksdje) {
            this.mbyqndksdje = mbyqndksdje;
        }

        public Double getKjzyhndmbdksehj() {
            return this.kjzyhndmbdksehj;
        }

        public void setKjzyhndmbdksehj(Double kjzyhndmbdksehj) {
            this.kjzyhndmbdksehj = kjzyhndmbdksehj;
        }

        public String getTzyy() {
            return this.tzyy;
        }

        public void setTzyy(String tzyy) {
            this.tzyy = tzyy;
        }
    }
}

package com.example.cloud.company.common.vo.xgm.hdxx;

import com.example.cloud.company.common.vo.xgm.qcxx.WsxxVo;
import com.example.cloud.company.common.vo.xgm.sbxx.sjgt3.zzsxgm.SBCcsNsrjbxxVO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HdxxSbzlResponseVo",
        propOrder = {"sbzlcode", "sbzlxlcode", "sbzlmc", "sbqj", "nsqxdm", "qccgbz", "qccgbzms", "sbqx", "zsxmbm", "zsxmpy", "zsxmmc", "pdfversion", "wsxxs", "zspms", "zszms", "lsxxs", "sbbs", "jmxx", "ssdc", "yyssecsxx", "nsrgrtsxx", "mdktzs", "hzsbxx", "ncpxx", "fzjgxx", "kshztlZzskfpdjbsVo", "dsdjmx", "zzsjmxxbs", "djxxs", "fzjgsdsfpb", "CSBZSPMS", "ysbbbz", "sksssqQ", "sksssqZ", "dkdjgrid", "dqdefyhzGrid", "cpmcs", "qysdshdjgs", "fjmkjsds", "skfpswsxtzs", "ycdkpzswsxtzs", "xkzzszyfpswsxtzs", "ssyhmx", "cjjzsymxbGrid", "czjzsymxbGrid", "nsrxxform", "fcsjmxxGrid", "skxxgrid", "tdzzsxmxxgrid", "dqyjskxxGrid", "gdsBz", "sbxxGrid", "yqtfpGrid", "yjxxGrid", "dqwrGrid", "swrGrid", "gfwrGrid", "zswrGrid", "dqswrpwxxGrid", "clsymxGrid", "cbsymxGrid", "zysxxGrid", "szysxxGrid", "dqdeGrSdsQcVO", "sbcxsfcjyjbxxGrid", "sb030QssbSyxxVO", "resbxxGrid", "yqtGrid", "zlfSkxxGrid", "sbsbxxGrid", "fssrSbxxGrid", "yjfxzbjzsbzGrid", "fjszspms", "fjsjmxx", "mbkstzxx2018Grid", "jwmbkstzxxGrid", "wtshlycqkGrid", "tzfxxs", "hznsFjsffpbGrid", "xejmGrid", "shbxfJfsbList", "sbfDwhzHdxxList", "fbzlxx", "zsxmdmGrid", "zspmdmGrid", "zszmdmGrid", "yhsdsbgGrid", "wftfzjgxx", "xmxx", "qysdsmbksmxbGrid", "sbskxxGrid"}
)
public class HdxxSbzlResponseVo {
    @XmlElement(
            name = "SBZLCODE",
            required = true
    )
    protected String sbzlcode = "";
    @XmlElement(
            name = "SBZLXLCODE",
            required = true
    )
    protected String sbzlxlcode = "";
    @XmlElement(
            name = "YSBBZ",
            required = true
    )
    protected String ysbbbz;
    @XmlElement(
            name = "SKSSSQ_Z",
            required = true
    )
    protected String sksssqZ;
    @XmlElement(
            name = "SKSSSQ_Q",
            required = true
    )
    protected String sksssqQ;
    @XmlElement(
            name = "SBZLMC",
            required = true
    )
    protected String sbzlmc = "";
    @XmlElement(
            name = "SBQJ",
            required = true
    )
    protected String sbqj = "";
    @XmlElement(
            name = "NSQX_DM",
            required = true
    )
    protected String nsqxdm = "";
    @XmlElement(
            name = "QCCGBZ",
            required = true,
            defaultValue = "Y"
    )
    protected String qccgbz = "";
    @XmlElement(
            name = "QCCGBZMS",
            required = true,
            defaultValue = "期初信息获取失败描述"
    )
    protected String qccgbzms = "";
    @XmlElement(
            name = "SBQX",
            required = true
    )
    protected String sbqx = "";
    @XmlElement(
            name = "ZSXMBM",
            required = true
    )
    protected String zsxmbm = "";
    @XmlElement(
            name = "ZSXMPY",
            required = true
    )
    protected String zsxmpy = "";
    @XmlElement(
            name = "ZSXMMC",
            required = true
    )
    protected String zsxmmc = "";
    @XmlElement(
            name = "PDF_VERSION",
            required = true
    )
    protected String pdfversion = "";
    @XmlElement(
            name = "WSXXS",
            required = true
    )
    protected WSXXS wsxxs;
    @XmlElement(
            name = "ZSPMS",
            required = true
    )
    protected ZSPMS zspms;
    @XmlElement(
            name = "ZSZMS",
            required = true
    )
    protected ZSZMS zszms;
    @XmlElement(
            name = "LSXXS",
            required = true
    )
    protected LSXXS lsxxs;
    @XmlElement(
            name = "SBBS",
            required = true
    )
    protected SBBS sbbs;
    @XmlElement(
            name = "JMXX",
            required = true
    )
    protected List<JMXX> jmxx;
    @XmlElement(
            name = "SSDC"
    )
    protected SsdcVo ssdc;
    @XmlElement(
            name = "YYSSECSXX"
    )
    protected YyssecsxxVo yyssecsxx;
    @XmlElement(
            name = "NSRGRTSXX"
    )
    protected NsrgrtsxxVo nsrgrtsxx;
    @XmlElement(
            name = "MDKTZS"
    )
    protected MDKTZS mdktzs;
    @XmlElement(
            name = "HZSBXX"
    )
    protected HZSBXX hzsbxx;
    @XmlElement(
            name = "KSHZTLZZSKFPDJBS"
    )
    protected KshztlZzskfpdjbsVo kshztlZzskfpdjbsVo;
    @XmlElement(
            name = "NCPXX"
    )
    protected NCPXX ncpxx;
    @XmlElement(
            name = "fbzlxx"
    )
    protected Fbzlxx fbzlxx = new Fbzlxx();
    @XmlElement(
            name = "FZJGXX",
            required = true
    )
    protected FZJGXX fzjgxx;
    @XmlElement(
            name = "WFTFZJGXX",
            required = true
    )
    protected FZJGXX wftfzjgxx;
    @XmlElement(
            name = "DSDJMXXXS",
            required = true
    )
    protected DSDJMXXXS dsdjmx;
    @XmlElement(
            name = "ZZSJMXXBS",
            required = true
    )
    protected ZZSJMXXBS zzsjmxxbs;
    @XmlElement(
            name = "DJXXS",
            required = true
    )
    protected DJXXS djxxs;
    @XmlElement(
            name = "FZJGSDSFPB",
            required = true
    )
    protected FzjgsdsfpbVo fzjgsdsfpb;
    @XmlElement(
            name = "CSBZSPMS",
            required = true
    )
    protected HdxxSbzlResponseVo.CSBZSPMS CSBZSPMS;
    @XmlElement(
            name = "DKDJGRID",
            required = true
    )
    protected DkdjGrid dkdjgrid;
    @XmlElement(
            name = "DQDEFYHZGRID",
            required = true
    )
    protected DqdefyhzVO dqdefyhzGrid;
    @XmlElement(
            name = "CJJZSYMXBGRID",
            required = true
    )
    protected CjjzsymxbGrid cjjzsymxbGrid;
    @XmlElement(
            name = "CZJZSYMXBGRID",
            required = true
    )
    protected CzjzsymxbGrid czjzsymxbGrid;
    @XmlElement(
            name = "FCSJMXXGRID",
            required = true
    )
    protected FcsjmxxGrid fcsjmxxGrid;
    @XmlElement(
            name = "NSRXXFORM",
            required = true
    )
    protected SBCcsNsrjbxxVO nsrxxform;
    @XmlElement(
            name = "CPMCS",
            required = true
    )
    protected CPMCS cpmcs;
    @XmlElement(
            name = "QYSDSHDJGS",
            required = true
    )
    protected QYSDSHDJGS qysdshdjgs;
    @XmlElement(
            name = "FJMKJSDS",
            required = true
    )
    protected FJMKJSDS fjmkjsds;
    @XmlElement(
            name = "SKFPSWSXTZS",
            required = true
    )
    protected Szsb02Response skfpswsxtzs;
    @XmlElement(
            name = "YCDKPZSWSXTZS",
            required = true
    )
    protected Szsb03Response ycdkpzswsxtzs;
    @XmlElement(
            name = "XKZZSZYFPSWSXTZS",
            required = true
    )
    protected Szsb04Response xkzzszyfpswsxtzs;
    @XmlElement(
            name = "SSYHMX",
            required = true
    )
    protected List<SSYHMX> ssyhmx;
    @XmlElement(
            name = "SKXXGRID",
            required = true
    )
    protected SkxxGrid skxxgrid;
    @XmlElement(
            name = "TDZZSXMXXGRID",
            required = true
    )
    protected TdzzsXmxxGrid tdzzsxmxxgrid;
    @XmlElement(
            name = "CLSYMXGRID",
            required = true
    )
    protected ClsymxGrid clsymxGrid;
    @XmlElement(
            name = "CBSYMXGRID",
            required = true
    )
    protected CbsymxGrid cbsymxGrid;
    @XmlElement(
            name = "ZYSXXGRID",
            required = true
    )
    protected ZysxxGrid zysxxGrid;
    @XmlElement(
            name = "SZYSXXGRID",
            required = true
    )
    protected SzysxxGrid szysxxGrid;
    @XmlElement(
            name = "DQYJSKXXGRID",
            required = true
    )
    protected DqyjskxxGrid dqyjskxxGrid;
    @XmlElement(
            name = "SBXXGRID",
            required = true
    )
    protected SbxxGrid sbxxGrid;
    @XmlElement(
            name = "FSSRSBXXGRID",
            required = true
    )
    protected SBFssrSbxxGrid fssrSbxxGrid;
    @XmlElement(
            name = "YJXXGRID",
            required = true
    )
    protected YjxxGrid yjxxGrid;
    @XmlElement(
            name = "DQWRGRID",
            required = true
    )
    protected DqwrGrid dqwrGrid;
    @XmlElement(
            name = "DqdeGrSdsQcVO",
            required = true
    )
    protected DqdeGrSdsQcVO dqdeGrSdsQcVO;
    @XmlElement(
            name = "SBCXSFCJYJBXXGrid",
            required = true
    )
    protected SBCXSFCJYJBXXGrid sbcxsfcjyjbxxGrid;
    protected SwrGrid swrGrid;
    protected GfwrGrid gfwrGrid;
    protected ZswrGrid zswrGrid;
    protected DqswrpwxxGrid dqswrpwxxGrid;
    @XmlElement(
            name = "SB030QSSBSYXXVO",
            required = true
    )
    protected Sb030QssbSyxxVO sb030QssbSyxxVO;
    protected ResbxxGrid resbxxGrid;
    protected YqtGrid yqtGrid;
    protected ZlfSkxxGrid zlfSkxxGrid;
    @XmlElement(
            name = "QYSDSMBKSMXBGRID",
            required = true
    )
    protected QysdsmbksmxbGrid qysdsmbksmxbGrid;
    @XmlElement(
            name = "sbsbxxGrid"
    )
    protected SbsbxxGrid sbsbxxGrid;
    @XmlElement(
            name = "shbxfJfsbList"
    )
    protected ShbxfJfsbList shbxfJfsbList;
    @XmlElement(
            name = "sbfDwhzHdxxList"
    )
    protected SbfDwhzHdxxList sbfDwhzHdxxList;
    @XmlElement(
            name = "yjfxzbjzsbzGrid",
            required = true
    )
    protected YjfxzbjzsbzGrid yjfxzbjzsbzGrid;
    @XmlElement(
            name = "FJSZSPMS",
            required = true
    )
    protected ZSPMS fjszspms;
    @XmlElement(
            name = "FJSJMXX",
            required = true
    )
    protected List<JMXX> fjsjmxx;
    @XmlElement(
            name = "xmxx",
            required = true
    )
    List<Xmxx> xmxx;
    @XmlElement(
            name = "mbkstzxx2018Grid"
    )
    protected Mbkstzxx2018Grid mbkstzxx2018Grid;
    @XmlElement(
            name = "jwmbkstzxxGrid"
    )
    protected JwmbkstzxxGrid jwmbkstzxxGrid;
    @XmlElement(
            name = "wtshlycqkGrid"
    )
    protected WtshlycqkGrid wtshlycqkGrid;
    @XmlElement(
            name = "TZFXXS",
            required = true
    )
    protected TZFXXS tzfxxs;
    @XmlElement(
            name = "HZNSFJSFFPBGRID",
            required = true
    )
    protected HznsFjsffpbGrid hznsFjsffpbGrid;
    @XmlElement(
            name = "zsxmdmGrid"
    )
    protected ZsxmdmGrid zsxmdmGrid;
    @XmlElement(
            name = "zspmdmGrid"
    )
    protected ZspmdmGrid zspmdmGrid;
    @XmlElement(
            name = "zszmdmGrid"
    )
    protected ZszmdmGrid zszmdmGrid;
    @XmlElement(
            name = "yhsdsbgGrid"
    )
    protected YhsdsbgGrid yhsdsbgGrid;
    protected XejmGrid xejmGrid;
    @XmlElement(
            name = "sbskxxGrid"
    )
    protected SbskxxGrid sbskxxGrid;
    @XmlElement(
            name = "YQTFPGRID",
            required = true
    )
    protected YqtfpGrid yqtfpGrid;
    @XmlElement(
            name = "GDSBZ",
            required = true
    )
    protected String gdsBz = "";

    public HdxxSbzlResponseVo() {
    }

    public TZFXXS getTzfxxs() {
        return this.tzfxxs;
    }

    public Fbzlxx getFbzlxx() {
        return this.fbzlxx;
    }

    public void setFbzlxx(Fbzlxx fbzlxx) {
        this.fbzlxx = fbzlxx;
    }

    public void setTzfxxs(TZFXXS tzfxxs) {
        this.tzfxxs = tzfxxs;
    }

    public WtshlycqkGrid getWtshlycqkGrid() {
        return this.wtshlycqkGrid;
    }

    public void setWtshlycqkGrid(WtshlycqkGrid wtshlycqkGrid) {
        this.wtshlycqkGrid = wtshlycqkGrid;
    }

    public ZSPMS getFjszspms() {
        return this.fjszspms;
    }

    public void setFjszspms(ZSPMS fjsZspms) {
        this.fjszspms = fjsZspms;
    }

    public List<JMXX> getFjsjmxx() {
        return this.fjsjmxx;
    }

    public void setFjsjmxx(List<JMXX> fjsJmxx) {
        this.fjsjmxx = fjsJmxx;
    }

    public YjfxzbjzsbzGrid getYjfxzbjzsbzGrid() {
        return this.yjfxzbjzsbzGrid;
    }

    public void setYjfxzbjzsbzGrid(YjfxzbjzsbzGrid yjfxzbjzsbzGrid) {
        this.yjfxzbjzsbzGrid = yjfxzbjzsbzGrid;
    }

    public SbsbxxGrid getSbsbxxGrid() {
        return this.sbsbxxGrid;
    }

    public void setSbsbxxGrid(SbsbxxGrid sbsbxxGrid) {
        this.sbsbxxGrid = sbsbxxGrid;
    }

    public ZlfSkxxGrid getZlfSkxxGrid() {
        return this.zlfSkxxGrid;
    }

    public void setZlfSkxxGrid(ZlfSkxxGrid zlfSkxxGrid) {
        this.zlfSkxxGrid = zlfSkxxGrid;
    }

    public YqtGrid getYqtGrid() {
        return this.yqtGrid;
    }

    public void setYqtGrid(YqtGrid yqtGrid) {
        this.yqtGrid = yqtGrid;
    }

    public ResbxxGrid getResbxxGrid() {
        return this.resbxxGrid;
    }

    public List<Xmxx> getXmxx() {
        if (this.xmxx == null) {
            this.xmxx = new ArrayList();
        }

        return this.xmxx;
    }

    public void setXmxx(List<Xmxx> xmxx) {
        this.xmxx = xmxx;
    }

    public void setResbxxGrid(ResbxxGrid resbxxGrid) {
        this.resbxxGrid = resbxxGrid;
    }

    public Sb030QssbSyxxVO getSb030QssbSyxxVO() {
        return this.sb030QssbSyxxVO;
    }

    public void setSb030QssbSyxxVO(Sb030QssbSyxxVO sb030QssbSyxxVO) {
        this.sb030QssbSyxxVO = sb030QssbSyxxVO;
    }

    public DqdeGrSdsQcVO getDqdeGrSdsQcVO() {
        return this.dqdeGrSdsQcVO;
    }

    public void setDqdeGrSdsQcVO(DqdeGrSdsQcVO dqdeGrSdsQcVO) {
        this.dqdeGrSdsQcVO = dqdeGrSdsQcVO;
    }

    public YjxxGrid getYjxxGrid() {
        return this.yjxxGrid;
    }

    public void setYjxxGrid(YjxxGrid yjxxGrid) {
        this.yjxxGrid = yjxxGrid;
    }

    public DqwrGrid getDqwrGrid() {
        return this.dqwrGrid;
    }

    public void setDqwrGrid(DqwrGrid dqwrGrid) {
        this.dqwrGrid = dqwrGrid;
    }

    public SwrGrid getSwrGrid() {
        return this.swrGrid;
    }

    public void setSwrGrid(SwrGrid swrGrid) {
        this.swrGrid = swrGrid;
    }

    public GfwrGrid getGfwrGrid() {
        return this.gfwrGrid;
    }

    public QysdsmbksmxbGrid getQysdsmbksmxbGrid() {
        return this.qysdsmbksmxbGrid;
    }

    public void setQysdsmbksmxbGrid(QysdsmbksmxbGrid qysdsmbksmxbGrid) {
        this.qysdsmbksmxbGrid = qysdsmbksmxbGrid;
    }

    public void setGfwrGrid(GfwrGrid gfwrGrid) {
        this.gfwrGrid = gfwrGrid;
    }

    public ZswrGrid getZswrGrid() {
        return this.zswrGrid;
    }

    public void setZswrGrid(ZswrGrid zswrGrid) {
        this.zswrGrid = zswrGrid;
    }

    public DqswrpwxxGrid getDqswrpwxxGrid() {
        return this.dqswrpwxxGrid;
    }

    public void setDqswrpwxxGrid(DqswrpwxxGrid dqswrpwxxGrid) {
        this.dqswrpwxxGrid = dqswrpwxxGrid;
    }

    public ZysxxGrid getZysxxGrid() {
        return this.zysxxGrid;
    }

    public void setZysxxGrid(ZysxxGrid zysxxGrid) {
        this.zysxxGrid = zysxxGrid;
    }

    public ClsymxGrid getClsymxGrid() {
        return this.clsymxGrid;
    }

    public void setClsymxGrid(ClsymxGrid clsymxGrid) {
        this.clsymxGrid = clsymxGrid;
    }

    public CbsymxGrid getCbsymxGrid() {
        return this.cbsymxGrid;
    }

    public void setCbsymxGrid(CbsymxGrid cbsymxGrid) {
        this.cbsymxGrid = cbsymxGrid;
    }

    public SbxxGrid getSbxxGrid() {
        return this.sbxxGrid;
    }

    public void setSbxxGrid(SbxxGrid sbxxGrid) {
        this.sbxxGrid = sbxxGrid;
    }

    public YqtfpGrid getYqtfpGrid() {
        return this.yqtfpGrid;
    }

    public void setYqtfpGrid(YqtfpGrid yqtfpGrid) {
        this.yqtfpGrid = yqtfpGrid;
    }

    public String getGdsBz() {
        return this.gdsBz;
    }

    public void setGdsBz(String gdsBz) {
        this.gdsBz = gdsBz;
    }

    public DqyjskxxGrid getDqyjskxxGrid() {
        return this.dqyjskxxGrid;
    }

    public void setDqyjskxxGrid(DqyjskxxGrid dqyjskxxGrid) {
        this.dqyjskxxGrid = dqyjskxxGrid;
    }

    public TdzzsXmxxGrid getTdzzsxmxxgrid() {
        return this.tdzzsxmxxgrid;
    }

    public void setTdzzsxmxxgrid(TdzzsXmxxGrid tdzzsxmxxgrid) {
        this.tdzzsxmxxgrid = tdzzsxmxxgrid;
    }

    public SkxxGrid getSkxxgrid() {
        return this.skxxgrid;
    }

    public void setSkxxgrid(SkxxGrid skxxgrid) {
        this.skxxgrid = skxxgrid;
    }

    public CjjzsymxbGrid getCjjzsymxbGrid() {
        return this.cjjzsymxbGrid;
    }

    public void setCjjzsymxbGrid(CjjzsymxbGrid cjjzsymxbGrid) {
        this.cjjzsymxbGrid = cjjzsymxbGrid;
    }

    public CzjzsymxbGrid getCzjzsymxbGrid() {
        return this.czjzsymxbGrid;
    }

    public SBCcsNsrjbxxVO getNsrxxform() {
        return this.nsrxxform;
    }

    public void setNsrxxform(SBCcsNsrjbxxVO nsrxxform) {
        this.nsrxxform = nsrxxform;
    }

    public void setCzjzsymxbGrid(CzjzsymxbGrid czjzsymxbGrid) {
        this.czjzsymxbGrid = czjzsymxbGrid;
    }

    public FcsjmxxGrid getFcsjmxxGrid() {
        return this.fcsjmxxGrid;
    }

    public void setFcsjmxxGrid(FcsjmxxGrid fcsjmxxGrid) {
        this.fcsjmxxGrid = fcsjmxxGrid;
    }

    public Mbkstzxx2018Grid getMbkstzxx2018Grid() {
        return this.mbkstzxx2018Grid;
    }

    public void setMbkstzxx2018Grid(Mbkstzxx2018Grid mbkstzxx2018Grid) {
        this.mbkstzxx2018Grid = mbkstzxx2018Grid;
    }

    public JwmbkstzxxGrid getJwmbkstzxxGrid() {
        return this.jwmbkstzxxGrid;
    }

    public void setJwmbkstzxxGrid(JwmbkstzxxGrid jwmbkstzxxGrid) {
        this.jwmbkstzxxGrid = jwmbkstzxxGrid;
    }

    public String getSBZLCODE() {
        return this.sbzlcode;
    }

    public void setSBZLCODE(String value) {
        this.sbzlcode = value;
    }

    public String getSBZLXLCODE() {
        return this.sbzlxlcode;
    }

    public void setSBZLXLCODE(String value) {
        this.sbzlxlcode = value;
    }

    public FZJGXX getWftfzjgxx() {
        return this.wftfzjgxx;
    }

    public void setWftfzjgxx(FZJGXX wftfzjgxx) {
        this.wftfzjgxx = wftfzjgxx;
    }

    public String getSBZLMC() {
        return this.sbzlmc;
    }

    public void setSBZLMC(String value) {
        this.sbzlmc = value;
    }

    public String getSBQJ() {
        return this.sbqj;
    }

    public void setSBQJ(String value) {
        this.sbqj = value;
    }

    public String getNSQXDM() {
        return this.nsqxdm;
    }

    public void setNSQXDM(String value) {
        this.nsqxdm = value;
    }

    public String getQCCGBZ() {
        return this.qccgbz;
    }

    public void setQCCGBZ(String value) {
        this.qccgbz = value;
    }

    public String getQCCGBZMS() {
        return this.qccgbzms;
    }

    public void setQCCGBZMS(String value) {
        this.qccgbzms = value;
    }

    public String getSBQX() {
        return this.sbqx;
    }

    public void setSBQX(String value) {
        this.sbqx = value;
    }

    public String getZSXMBM() {
        return this.zsxmbm;
    }

    public void setZSXMBM(String value) {
        this.zsxmbm = value;
    }

    public String getZSXMPY() {
        return this.zsxmpy;
    }

    public void setZSXMPY(String value) {
        this.zsxmpy = value;
    }

    public String getZSXMMC() {
        return this.zsxmmc;
    }

    public void setZSXMMC(String value) {
        this.zsxmmc = value;
    }

    public String getPDFVERSION() {
        return this.pdfversion;
    }

    public void setPDFVERSION(String value) {
        this.pdfversion = value;
    }

    public WSXXS getWSXXS() {
        return this.wsxxs;
    }

    public void setWSXXS(WSXXS value) {
        this.wsxxs = value;
    }

    public ZSPMS getZSPMS() {
        return this.zspms;
    }

    public void setZSPMS(ZSPMS value) {
        this.zspms = value;
    }

    public HdxxSbzlResponseVo.CSBZSPMS getCSBZSPMS() {
        return this.CSBZSPMS;
    }

    public void setCSBZSPMS(HdxxSbzlResponseVo.CSBZSPMS value) {
        this.CSBZSPMS = value;
    }

    public LSXXS getLSXXS() {
        return this.lsxxs;
    }

    public void setLSXXS(LSXXS value) {
        this.lsxxs = value;
    }

    public SBBS getSBBS() {
        return this.sbbs;
    }

    public void setSBBS(SBBS value) {
        this.sbbs = value;
    }

    public List<JMXX> getJMXX() {
        if (this.jmxx == null) {
            this.jmxx = new ArrayList();
        }

        return this.jmxx;
    }

    public SsdcVo getSSDC() {
        return this.ssdc;
    }

    public void setSSDC(SsdcVo value) {
        this.ssdc = value;
    }

    public YyssecsxxVo getYYSSECSXX() {
        return this.yyssecsxx;
    }

    public void setYYSSECSXX(YyssecsxxVo value) {
        this.yyssecsxx = value;
    }

    public NsrgrtsxxVo getNSRGRTSXX() {
        return this.nsrgrtsxx;
    }

    public void setNSRGRTSXX(NsrgrtsxxVo value) {
        this.nsrgrtsxx = value;
    }

    public MDKTZS getMDKTZS() {
        return this.mdktzs;
    }

    public void setMDKTZS(MDKTZS value) {
        this.mdktzs = value;
    }

    public HZSBXX getHZSBXX() {
        return this.hzsbxx;
    }

    public void setHZSBXX(HZSBXX value) {
        this.hzsbxx = value;
    }

    public NCPXX getNCPXX() {
        return this.ncpxx;
    }

    public void setNCPXX(NCPXX value) {
        this.ncpxx = value;
    }

    public SBCXSFCJYJBXXGrid getSbcxsfcjyjbxxGrid() {
        return this.sbcxsfcjyjbxxGrid;
    }

    public void setSbcxsfcjyjbxxGrid(SBCXSFCJYJBXXGrid sbcxsfcjyjbxxGrid) {
        this.sbcxsfcjyjbxxGrid = sbcxsfcjyjbxxGrid;
    }

    public FZJGXX getFZJGXX() {
        return this.fzjgxx;
    }

    public void setFZJGXX(FZJGXX value) {
        this.fzjgxx = value;
    }

    public KshztlZzskfpdjbsVo getKshztlZzskfpdjbsVo() {
        return this.kshztlZzskfpdjbsVo;
    }

    public void setKshztlZzskfpdjbsVo(KshztlZzskfpdjbsVo value) {
        this.kshztlZzskfpdjbsVo = value;
    }

    public DSDJMXXXS getDsdjmx() {
        return this.dsdjmx;
    }

    public void setDsdjmx(DSDJMXXXS dsdjmx) {
        this.dsdjmx = dsdjmx;
    }

    public ZZSJMXXBS getZzsjmxxbs() {
        return this.zzsjmxxbs;
    }

    public void setZzsjmxxbs(ZZSJMXXBS zzsjmxxbs) {
        this.zzsjmxxbs = zzsjmxxbs;
    }

    public DJXXS getDjxxs() {
        return this.djxxs;
    }

    public void setDjxxs(DJXXS djxxs) {
        this.djxxs = djxxs;
    }

    public FzjgsdsfpbVo getFZJGSDSFPB() {
        return this.fzjgsdsfpb;
    }

    public void setFZJGSDSFPB(FzjgsdsfpbVo value) {
        this.fzjgsdsfpb = value;
    }

    public SzysxxGrid getSzysxxGrid() {
        return this.szysxxGrid;
    }

    public void setSzysxxGrid(SzysxxGrid szysxxGrid) {
        this.szysxxGrid = szysxxGrid;
    }

    public String getYsbbbz() {
        return this.ysbbbz;
    }

    public void setYsbbbz(String ysbbbz) {
        this.ysbbbz = ysbbbz;
    }

    public String getSksssqZ() {
        return this.sksssqZ;
    }

    public void setSksssqZ(String sksssqZ) {
        this.sksssqZ = sksssqZ;
    }

    public String getSksssqQ() {
        return this.sksssqQ;
    }

    public void setSksssqQ(String sksssqQ) {
        this.sksssqQ = sksssqQ;
    }

    public DkdjGrid getDkdjgrid() {
        return this.dkdjgrid;
    }

    public void setDkdjgrid(DkdjGrid dkdjgrid) {
        this.dkdjgrid = dkdjgrid;
    }

    public DqdefyhzVO getDqdefyhzGrid() {
        return this.dqdefyhzGrid;
    }

    public void setDqdefyhzGrid(DqdefyhzVO dqdefyhzGrid) {
        this.dqdefyhzGrid = dqdefyhzGrid;
    }

    public List<SSYHMX> getSsyhmx() {
        return (List)(null == this.ssyhmx ? new ArrayList() : this.ssyhmx);
    }

    public void setSsyhmx(List<SSYHMX> ssyhmx) {
        this.ssyhmx = ssyhmx;
    }

    public CPMCS getCpmcs() {
        return this.cpmcs;
    }

    public void setCpmcs(CPMCS cpmcs) {
        this.cpmcs = cpmcs;
    }

    public QYSDSHDJGS getQysdshdjgs() {
        if (null == this.qysdshdjgs) {
            this.qysdshdjgs = new QYSDSHDJGS();
        }

        return this.qysdshdjgs;
    }

    public void setQysdshdjgs(QYSDSHDJGS qysdshdjgs) {
        this.qysdshdjgs = qysdshdjgs;
    }

    public FJMKJSDS getFjmkjsds() {
        if (null == this.fjmkjsds) {
            this.fjmkjsds = new FJMKJSDS();
        }

        return this.fjmkjsds;
    }

    public void setFjmkjsds(FJMKJSDS fjmkjsds) {
        this.fjmkjsds = fjmkjsds;
    }

    public Szsb03Response getYcdkpzswsxtzs() {
        return this.ycdkpzswsxtzs;
    }

    public void setYcdkpzswsxtzs(Szsb03Response ycdkpzswsxtzs) {
        this.ycdkpzswsxtzs = ycdkpzswsxtzs;
    }

    public Szsb02Response getSkfpswsxtzs() {
        return this.skfpswsxtzs;
    }

    public void setSkfpswsxtzs(Szsb02Response skfpswsxtzs) {
        this.skfpswsxtzs = skfpswsxtzs;
    }

    public Szsb04Response getXkzzszyfpswsxtzs() {
        return this.xkzzszyfpswsxtzs;
    }

    public void setXkzzszyfpswsxtzs(Szsb04Response xkzzszyfpswsxtzs) {
        this.xkzzszyfpswsxtzs = xkzzszyfpswsxtzs;
    }

    public SBFssrSbxxGrid getFssrSbxxGrid() {
        return this.fssrSbxxGrid;
    }

    public void setFssrSbxxGrid(SBFssrSbxxGrid fssrSbxxGrid) {
        this.fssrSbxxGrid = fssrSbxxGrid;
    }

    public HznsFjsffpbGrid getHznsFjsffpbGrid() {
        return this.hznsFjsffpbGrid;
    }

    public void setHznsFjsffpbGrid(HznsFjsffpbGrid hznsFjsffpbGrid) {
        this.hznsFjsffpbGrid = hznsFjsffpbGrid;
    }

    public XejmGrid getXejmGrid() {
        return this.xejmGrid;
    }

    public void setXejmGrid(XejmGrid xejmGrid) {
        this.xejmGrid = xejmGrid;
    }

    public ShbxfJfsbList getShbxfJfsbList() {
        return this.shbxfJfsbList;
    }

    public void setShbxfJfsbList(ShbxfJfsbList shbxfJfsbList) {
        this.shbxfJfsbList = shbxfJfsbList;
    }

    public SbfDwhzHdxxList getSbfDwhzHdxxList() {
        return this.sbfDwhzHdxxList;
    }

    public void setSbfDwhzHdxxList(SbfDwhzHdxxList sbfDwhzHdxxList) {
        this.sbfDwhzHdxxList = sbfDwhzHdxxList;
    }

    public ZSZMS getZszms() {
        return this.zszms;
    }

    public void setZszms(ZSZMS zszms) {
        this.zszms = zszms;
    }

    public ZsxmdmGrid getZsxmdmGrid() {
        return this.zsxmdmGrid;
    }

    public void setZsxmdmGrid(ZsxmdmGrid zsxmdmGrid) {
        this.zsxmdmGrid = zsxmdmGrid;
    }

    public ZspmdmGrid getZspmdmGrid() {
        return this.zspmdmGrid;
    }

    public void setZspmdmGrid(ZspmdmGrid zspmdmGrid) {
        this.zspmdmGrid = zspmdmGrid;
    }

    public ZszmdmGrid getZszmdmGrid() {
        return this.zszmdmGrid;
    }

    public void setZszmdmGrid(ZszmdmGrid zszmdmGrid) {
        this.zszmdmGrid = zszmdmGrid;
    }

    public YhsdsbgGrid getYhsdsbgGrid() {
        return this.yhsdsbgGrid;
    }

    public void setYhsdsbgGrid(YhsdsbgGrid yhsdsbgGrid) {
        this.yhsdsbgGrid = yhsdsbgGrid;
    }

    public SbskxxGrid getSbskxxGrid() {
        return this.sbskxxGrid;
    }

    public void setSbskxxGrid(SbskxxGrid sbskxxGrid) {
        this.sbskxxGrid = sbskxxGrid;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"yjxxGridlb"}
    )
    public static class YjxxGrid {
        protected List<HdSBYjxxJhVO> yjxxGridlb;

        public YjxxGrid() {
        }

        public void setYjxxGridlb(List<HdSBYjxxJhVO> yjxxGridlb) {
            this.yjxxGridlb = yjxxGridlb;
        }

        public List<HdSBYjxxJhVO> getYjxxGridlb() {
            if (this.yjxxGridlb == null) {
                this.yjxxGridlb = new ArrayList();
            }

            return this.yjxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"yqtfpGridlb"}
    )
    public static class YqtfpGrid {
        @XmlElement(
                required = true
        )
        protected List<HdSByqtfpxxVO> yqtfpGridlb;

        public YqtfpGrid() {
        }

        public List<HdSByqtfpxxVO> getYqtfpGridlb() {
            if (this.yqtfpGridlb == null) {
                this.yqtfpGridlb = new ArrayList();
            }

            return this.yqtfpGridlb;
        }

        public void setYqtfpGridlb(List<HdSByqtfpxxVO> yqtfpGridlb) {
            this.yqtfpGridlb = yqtfpGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "SbxxGrid",
            propOrder = {"sbxxGridlb"}
    )
    public static class SbxxGrid {
        protected List<HdSBSbxxJhVO> sbxxGridlb;

        public SbxxGrid() {
        }

        public List<HdSBSbxxJhVO> getSbxxGridlb() {
            if (this.sbxxGridlb == null) {
                this.sbxxGridlb = new ArrayList();
            }

            return this.sbxxGridlb;
        }

        public void setSbxxGridlb(List<HdSBSbxxJhVO> sbxxGridlb) {
            this.sbxxGridlb = sbxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"fjmkjsdsGrid"}
    )
    public static class FJMKJSDS {
        @XmlElement(
                name = "FJMKJSDSGRID",
                required = true
        )
        protected List<FjmkjSdsVo> fjmkjsdsGrid;

        public FJMKJSDS() {
        }

        public List<FjmkjSdsVo> getFjmkjsdsGrid() {
            if (this.fjmkjsdsGrid == null) {
                this.fjmkjsdsGrid = new ArrayList();
            }

            return this.fjmkjsdsGrid;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"qysdshdjg"}
    )
    public static class QYSDSHDJGS {
        @XmlElement(
                name = "QYSDSHDJG",
                required = true
        )
        protected List<QysdshdjgVo> qysdshdjg;

        public QYSDSHDJGS() {
        }

        public List<QysdshdjgVo> getQysdshdjg() {
            if (this.qysdshdjg == null) {
                this.qysdshdjg = new ArrayList();
            }

            return this.qysdshdjg;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"djxxList"}
    )
    public static class DJXXS {
        @XmlElement(
                name = "DJXX",
                required = true
        )
        protected List<DjxxVO> djxxList;

        public DJXXS() {
        }

        public List<DjxxVO> getDjxxList() {
            if (this.djxxList == null) {
                this.djxxList = new ArrayList();
            }

            return this.djxxList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zzsjmxxList"}
    )
    public static class ZZSJMXXBS {
        @XmlElement(
                name = "ZZSJMXXB",
                required = true
        )
        protected List<ZzsjmxxVO> zzsjmxxList;

        public ZZSJMXXBS() {
        }

        public List<ZzsjmxxVO> getZzsjmxxList() {
            if (this.zzsjmxxList == null) {
                this.zzsjmxxList = new ArrayList();
            }

            return this.zzsjmxxList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"dsdjMxList"}
    )
    public static class DSDJMXXXS {
        @XmlElement(
                name = "DSDJMXXX",
                required = true
        )
        protected List<DsdjMxVo> dsdjMxList;

        public DSDJMXXXS() {
        }

        public List<DsdjMxVo> getZspmList() {
            if (this.dsdjMxList == null) {
                this.dsdjMxList = new ArrayList();
            }

            return this.dsdjMxList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"fzjgList"}
    )
    public static class FZJGXX {
        @XmlElement(
                name = "FZJG",
                required = true
        )
        protected List<FzjgVo> fzjgList;

        public FZJGXX() {
        }

        public List<FzjgVo> getFzjgList() {
            if (this.fzjgList == null) {
                this.fzjgList = new ArrayList();
            }

            return this.fzjgList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"csbzspmList"}
    )
    public static class CSBZSPMS {
        @XmlElement(
                name = "CSBZSPM",
                required = true
        )
        protected List<CSBZSPMVo> csbzspmList;

        public CSBZSPMS() {
        }

        public List<CSBZSPMVo> getCsbzspmList() {
            if (this.csbzspmList == null) {
                this.csbzspmList = new ArrayList();
            }

            return this.csbzspmList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zszmList"}
    )
    public static class ZSZMS {
        @XmlElement(
                name = "ZSZM",
                required = true
        )
        protected List<ZszmlbVo> zszmList;

        public ZSZMS() {
        }

        public List<ZszmlbVo> getZszmList() {
            if (this.zszmList == null) {
                this.zszmList = new ArrayList();
            }

            return this.zszmList;
        }

        public void setZszmList(List<ZszmlbVo> zszmList) {
            this.zszmList = zszmList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zspmList"}
    )
    public static class ZSPMS {
        @XmlElement(
                name = "ZSPM",
                required = true
        )
        protected List<ZspmVo> zspmList;

        public ZSPMS() {
        }

        public List<ZspmVo> getZspmList() {
            if (this.zspmList == null) {
                this.zspmList = new ArrayList();
            }

            return this.zspmList;
        }

        public void setZspmList(List<ZspmVo> zspmList) {
            this.zspmList = zspmList;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "zlfSkxxGrid",
            propOrder = {"zlfSkxxGridlb"}
    )
    public static class ZlfSkxxGrid {
        protected List<ZlfSkxxGridlb> zlfSkxxGridlb;

        public ZlfSkxxGrid() {
        }

        public List<ZlfSkxxGridlb> getZlfSkxxGridlb() {
            if (this.zlfSkxxGridlb == null) {
                this.zlfSkxxGridlb = new ArrayList();
            }

            return this.zlfSkxxGridlb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"wsxx"}
    )
    public static class WSXXS {
        @XmlElement(
                name = "WSXX",
                required = true
        )
        protected List<WsxxVo> wsxx;

        public WSXXS() {
        }

        public List<WsxxVo> getWSXX() {
            if (this.wsxx == null) {
                this.wsxx = new ArrayList();
            }

            return this.wsxx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"tzfxx"}
    )
    public static class TZFXXS {
        @XmlElement(
                name = "TZFXX",
                required = true
        )
        protected List<Tzfxx> tzfxx;

        public TZFXXS() {
        }

        public List<Tzfxx> getTZFXXS() {
            if (this.tzfxx == null) {
                this.tzfxx = new ArrayList();
            }

            return this.tzfxx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"sbb"}
    )
    public static class SBBS {
        @XmlElement(
                name = "SBB",
                required = true
        )
        protected List<String> sbb;

        public SBBS() {
        }

        public List<String> getSBB() {
            if (this.sbb == null) {
                this.sbb = new ArrayList();
            }

            return this.sbb;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"fbzl"}
    )
    public static class Fbzlxx implements Serializable {
        protected List<FbzlVO> fbzl;

        public Fbzlxx() {
        }

        public List<FbzlVO> getFbzl() {
            if (this.fbzl == null) {
                this.fbzl = new ArrayList();
            }

            return this.fbzl;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"lsxx"}
    )
    public static class NCPXX {
        @XmlElement(
                name = "LSXX",
                required = true
        )
        protected List<LsxxVo> lsxx;

        public NCPXX() {
        }

        public List<LsxxVo> getLSXX() {
            if (this.lsxx == null) {
                this.lsxx = new ArrayList();
            }

            return this.lsxx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"mdktzsmx"}
    )
    public static class MDKTZS {
        @XmlElement(
                name = "MDKTZS_MX",
                required = true
        )
        protected List<MdktzsMxVo> mdktzsmx;

        public MDKTZS() {
        }

        public List<MdktzsMxVo> getMDKTZSMX() {
            if (this.mdktzsmx == null) {
                this.mdktzsmx = new ArrayList();
            }

            return this.mdktzsmx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"lsxx"}
    )
    public static class LSXXS {
        @XmlElement(
                name = "LSXX",
                required = true
        )
        protected List<LsxxVo> lsxx;

        public LSXXS() {
        }

        public List<LsxxVo> getLSXX() {
            if (this.lsxx == null) {
                this.lsxx = new ArrayList();
            }

            return this.lsxx;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"zsxmDm", "zspmDm", "zspmmc", "jmlxDm", "jmfsDm", "jmzlxDm", "jmqxq", "jmqxz", "ssjmzlDm", "ssjmyyDm", "ssjmxzhzDm", "ssjmxzdlDm", "ssjmxzxlDm", "jzfd", "jzsl", "jzed", "jmxzMc", "jmwjDm", "zsxmMc", "zspmMc", "jmlxMc", "jmfsMc", "jmzlxMc", "ssjmxzdlMc", "ssjmxzxlMc", "jmsspsxDm", "swsxMc", "jmxzDm", "jmxmMc", "jmxmDm", "nsqxDm", "jmfd", "zzsJmsl", "yhpzuuid", "sysl", "xgbz", "sl", "spbm", "fpzlDms"}
    )
    public static class JMXX extends JmxxTypeVO implements Serializable {
        private static final long serialVersionUID = 1L;
        @XmlElement(
                required = true
        )
        protected String zsxmDm = "";
        @XmlElement(
                required = true
        )
        protected String zspmDm = "";
        protected String zspmmc = "";
        @XmlElement(
                required = true
        )
        protected String jmlxDm = "";
        @XmlElement(
                required = true
        )
        protected String jmfsDm = "";
        @XmlElement(
                required = true
        )
        protected String jmzlxDm = "";
        @XmlElement(
                required = true
        )
        protected String jmqxq = "";
        @XmlElement(
                required = true
        )
        protected String jmqxz = "";
        @XmlElement(
                required = true
        )
        protected String ssjmzlDm = "";
        @XmlElement(
                required = true
        )
        protected String ssjmyyDm = "";
        @XmlElement(
                required = true
        )
        protected String ssjmxzhzDm = "";
        @XmlElement(
                required = true
        )
        protected String ssjmxzdlDm = "";
        @XmlElement(
                required = true
        )
        protected String ssjmxzxlDm = "";
        @XmlElement(
                required = true
        )
        protected String jmfd = "";
        @XmlElement(
                required = true
        )
        protected String yhpzuuid = "";
        @XmlElement(
                required = true
        )
        protected String sysl = "";
        @XmlElement(
                required = true
        )
        protected String xgbz = "";
        @XmlElement(
                required = true
        )
        protected String sl = "";
        @XmlElement(
                required = true
        )
        protected String spbm = "";
        protected double jzfd;
        protected double jzsl;
        protected double jzed;
        @XmlElement(
                required = true
        )
        protected String jmxzMc = "";
        protected double jmwjDm;
        @XmlElement(
                required = true
        )
        protected String zsxmMc;
        @XmlElement(
                required = true
        )
        protected String zspmMc;
        @XmlElement(
                required = true
        )
        protected String jmlxMc;
        @XmlElement(
                required = true
        )
        protected String jmfsMc;
        @XmlElement(
                required = true
        )
        protected String jmzlxMc;
        @XmlElement(
                required = true
        )
        protected String ssjmxzdlMc;
        @XmlElement(
                required = true
        )
        protected String ssjmxzxlMc;
        @XmlElement(
                required = true
        )
        protected String jmsspsxDm;
        @XmlElement(
                required = true
        )
        protected String swsxMc;
        @XmlElement(
                required = true
        )
        protected String jmxzDm = "";
        @XmlElement(
                required = true
        )
        protected String jmxmMc = "";
        @XmlElement(
                required = true
        )
        protected String jmxmDm = "";
        protected String nsqxDm = "";
        protected String zzsJmsl;
        protected List<String> fpzlDms;

        public JMXX() {
        }

        public List<String> getFpzlDms() {
            if (null == this.fpzlDms) {
                this.fpzlDms = new ArrayList();
            }

            return this.fpzlDms;
        }

        public void setFpzlDms(List<String> fpzlDms) {
            this.fpzlDms = fpzlDms;
        }

        public String getSysl() {
            return this.sysl;
        }

        public void setSysl(String sysl) {
            this.sysl = sysl;
        }

        public String getXgbz() {
            return this.xgbz;
        }

        public void setXgbz(String xgbz) {
            this.xgbz = xgbz;
        }

        public String getSl() {
            return this.sl;
        }

        public void setSl(String sl) {
            this.sl = sl;
        }

        public String getSpbm() {
            return this.spbm;
        }

        public void setSpbm(String spbm) {
            this.spbm = spbm;
        }

        public String getJmfd() {
            return this.jmfd;
        }

        public void setJmfd(String jmfd) {
            this.jmfd = jmfd;
        }

        public String getZzsJmsl() {
            return this.zzsJmsl;
        }

        public void setZzsJmsl(String zzsJmsl) {
            this.zzsJmsl = zzsJmsl;
        }

        public String getNsqxDm() {
            return this.nsqxDm;
        }

        public void setNsqxDm(String nsqxDm) {
            this.nsqxDm = nsqxDm;
        }

        public String getJmxzDm() {
            return this.jmxzDm;
        }

        public void setJmxzDm(String jmxzDm) {
            this.jmxzDm = jmxzDm;
        }

        public String getJmxmMc() {
            return this.jmxmMc;
        }

        public void setJmxmMc(String jmxmMc) {
            this.jmxmMc = jmxmMc;
        }

        public String getJmxmDm() {
            return this.jmxmDm;
        }

        public void setJmxmDm(String jmxmDm) {
            this.jmxmDm = jmxmDm;
        }

        public String getZsxmMc() {
            return this.zsxmMc;
        }

        public void setZsxmMc(String zsxmMc) {
            this.zsxmMc = zsxmMc;
        }

        public String getZspmMc() {
            return this.zspmMc;
        }

        public void setZspmMc(String zspmMc) {
            this.zspmMc = zspmMc;
        }

        public String getJmlxMc() {
            return this.jmlxMc;
        }

        public void setJmlxMc(String jmlxMc) {
            this.jmlxMc = jmlxMc;
        }

        public String getJmfsMc() {
            return this.jmfsMc;
        }

        public void setJmfsMc(String jmfsMc) {
            this.jmfsMc = jmfsMc;
        }

        public String getJmzlxMc() {
            return this.jmzlxMc;
        }

        public void setJmzlxMc(String jmzlxMc) {
            this.jmzlxMc = jmzlxMc;
        }

        public String getSsjmxzdlMc() {
            return this.ssjmxzdlMc;
        }

        public void setSsjmxzdlMc(String ssjmxzdlMc) {
            this.ssjmxzdlMc = ssjmxzdlMc;
        }

        public String getSsjmxzxlMc() {
            return this.ssjmxzxlMc;
        }

        public void setSsjmxzxlMc(String ssjmxzxlMc) {
            this.ssjmxzxlMc = ssjmxzxlMc;
        }

        public String getJmsspsxDm() {
            return this.jmsspsxDm;
        }

        public void setJmsspsxDm(String jmsspsxDm) {
            this.jmsspsxDm = jmsspsxDm;
        }

        public String getSwsxMc() {
            return this.swsxMc;
        }

        public void setSwsxMc(String swsxMc) {
            this.swsxMc = swsxMc;
        }

        public String getYhpzuuid() {
            return this.yhpzuuid;
        }

        public void setYhpzuuid(String yhpzuuid) {
            this.yhpzuuid = yhpzuuid;
        }

        public String getZsxmDm() {
            return this.zsxmDm;
        }

        public void setZsxmDm(String value) {
            this.zsxmDm = value;
        }

        public String getZspmDm() {
            return this.zspmDm;
        }

        public void setZspmDm(String value) {
            this.zspmDm = value;
        }

        public String getJmlxDm() {
            return this.jmlxDm;
        }

        public void setJmlxDm(String value) {
            this.jmlxDm = value;
        }

        public String getJmfsDm() {
            return this.jmfsDm;
        }

        public void setJmfsDm(String value) {
            this.jmfsDm = value;
        }

        public String getJmzlxDm() {
            return this.jmzlxDm;
        }

        public void setJmzlxDm(String value) {
            this.jmzlxDm = value;
        }

        public String getJmqxq() {
            return this.jmqxq;
        }

        public String getZspmmc() {
            return this.zspmmc;
        }

        public void setZspmmc(String zspmmc) {
            this.zspmmc = zspmmc;
        }

        public void setJmqxq(String value) {
            this.jmqxq = value;
        }

        public String getJmqxz() {
            return this.jmqxz;
        }

        public void setJmqxz(String value) {
            this.jmqxz = value;
        }

        public String getSsjmzlDm() {
            return this.ssjmzlDm;
        }

        public void setSsjmzlDm(String value) {
            this.ssjmzlDm = value;
        }

        public String getSsjmyyDm() {
            return this.ssjmyyDm;
        }

        public void setSsjmyyDm(String value) {
            this.ssjmyyDm = value;
        }

        public String getSsjmxzhzDm() {
            return this.ssjmxzhzDm;
        }

        public void setSsjmxzhzDm(String value) {
            this.ssjmxzhzDm = value;
        }

        public String getSsjmxzdlDm() {
            return this.ssjmxzdlDm;
        }

        public void setSsjmxzdlDm(String value) {
            this.ssjmxzdlDm = value;
        }

        public String getSsjmxzxlDm() {
            return this.ssjmxzxlDm;
        }

        public void setSsjmxzxlDm(String value) {
            this.ssjmxzxlDm = value;
        }

        public String getJmxzMc() {
            return this.jmxzMc;
        }

        public void setJmxzMc(String value) {
            this.jmxzMc = value;
        }

        public double getJzfd() {
            return this.jzfd;
        }

        public void setJzfd(double value) {
            this.jzfd = value;
        }

        public double getJzsl() {
            return this.jzsl;
        }

        public void setJzsl(double value) {
            this.jzsl = value;
        }

        public double getJzed() {
            return this.jzed;
        }

        public void setJzed(double value) {
            this.jzed = value;
        }

        public double getJmwjDm() {
            return this.jmwjDm;
        }

        public void setJmwjDm(double jmwjDm) {
            this.jmwjDm = jmwjDm;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"hzsbxxmx"}
    )
    public static class HZSBXX {
        @XmlElement(
                name = "HZSBXX_MX",
                required = true
        )
        protected List<HzsbxxMxVo> hzsbxxmx;

        public HZSBXX() {
        }

        public List<HzsbxxMxVo> getHZSBXXMX() {
            if (this.hzsbxxmx == null) {
                this.hzsbxxmx = new ArrayList();
            }

            return this.hzsbxxmx;
        }
    }
}


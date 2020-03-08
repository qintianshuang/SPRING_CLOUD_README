package com.example.cloud.db.dao.sb.xgm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cloud.db.po.sb.xgm.ZsxmDmslPO;
import com.example.cloud.service.base.vo.ResultVo;

public interface IHdxxTqDao extends IService<ZsxmDmslPO> {
    /***
     *
     * @param djxh
     * @param s
     * @param sssqq
     * @param sssqz
     * @return
     */
    ResultVo queryFjsZspms(String djxh, String s, String sssqq, String sssqz);

    /***
     *
     * @param phjmxzDm
     * @return
     */
    ResultVo queryFjsJzblByJmxzDm(String phjmxzDm);

    /***
     *
     * @param djxh
     * @return
     */
    ResultVo isYrdhyqwrdYbnsr(String djxh);

    /***
     *
     * @param s
     * @param sssqQ
     * @param sssqZ
     * @param djxh
     * @return
     */
    ResultVo queryFjssfzrdxx(String s, String sssqQ, String sssqZ, String djxh);

    /***
     *
     * @param hymx
     * @return
     */
    ResultVo isYgzqy(String hymx);

    /***
     *
     * @param sssqQ
     * @param sssqZ
     * @return
     */
    ResultVo queryzgkjmxxNew(String sssqQ, String sssqZ);

    /***
     *
     * @param jmxzDm
     * @return
     */
    ResultVo queryJsxzDmAndMc(String jmxzDm);

    /***
     *
     * @param djxh
     * @param sssqQ
     * @param sssqZ
     * @return
     */
    boolean IsQhjtNsr(String djxh, String sssqQ, String sssqZ);
}

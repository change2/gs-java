/*
 * $Id: IdService.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid;

import java.util.Date;

/**
 * UUID服务,产生UUID(64-bit)
 * 
 * @author Wu Yiqun
 */
public interface IdService {

    /**
     * 生成long类型UUID
     */
    public long getId();

    /**
     * 返回UUID对应的时间
     * 
     * @param id long类型UUID
     * @return 对应的时间
     */
    public Date getTime(long id);

    /**
     * 返回UUID对应的Node
     * 
     * @param id long类型UUID
     * @return 对应的Node
     */
    public int getNode(long id);

    /**
     * 返回UUID对应的Sequence
     * 
     * @param id long类型UUID
     * @return 对应的Sequence
     */
    public int getSequence(long id);

    /**
     * 返回UUID的字符串表示
     * 
     * @param id long类型UUID
     * @return UUID的字符串表示
     */
    public String getString(long id);

}

/*
 * $Id: IdService.java 976 2009-04-21 07:59:22Z yqwu $
 * $Revision: 976 $
 */

package com.etonenet.uuid;

import java.util.Date;

/**
 * UUID����,����UUID(64-bit)
 * 
 * @author Wu Yiqun
 */
public interface IdService {

    /**
     * ����long����UUID
     */
    public long getId();

    /**
     * ����UUID��Ӧ��ʱ��
     * 
     * @param id long����UUID
     * @return ��Ӧ��ʱ��
     */
    public Date getTime(long id);

    /**
     * ����UUID��Ӧ��Node
     * 
     * @param id long����UUID
     * @return ��Ӧ��Node
     */
    public int getNode(long id);

    /**
     * ����UUID��Ӧ��Sequence
     * 
     * @param id long����UUID
     * @return ��Ӧ��Sequence
     */
    public int getSequence(long id);

    /**
     * ����UUID���ַ�����ʾ
     * 
     * @param id long����UUID
     * @return UUID���ַ�����ʾ
     */
    public String getString(long id);

}

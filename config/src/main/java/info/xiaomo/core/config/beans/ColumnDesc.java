/**
 * 创建日期:  2017年08月12日 15:51
 * 创建作者:  杨 强  <281455776@qq.com>
 */
package info.xiaomo.core.config.beans;


import info.xiaomo.core.config.IConverter;
import lombok.Data;

import java.lang.reflect.Field;

/**
 * 字段描述
 *
 * @author YangQiang
 */
@Data
public class ColumnDesc {
    /**
     * 列名
     */
    private String name;
    /**
     * 是否允许不为null
     */
    private boolean notNull;
    /**
     * 对应的字段属性
     */
    private Field field;
    /**
     * 字段的转换器
     */
    private IConverter converter;

    public ColumnDesc() {
    }


}

package com.example.logdemo.test.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName todo
 */
@TableName(value ="todo")
@Data
public class Todo implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "description")
    private String description;

    /**
     * 0-重要且紧急；1-重要不紧急；2-紧急不重要；3-不紧急不重要
     */
    @TableField(value = "priority")
    private Integer priority;

    /**
     * 0-未分类；1-生活；2-娱乐；3-学习；4-工作
     */
    @TableField(value = "category_id")
    private String category_id;

    /**
     * 0-钉钉；1-微信消息；2-微信公众号；3-qq；4-邮件
     */
    @TableField(value = "remind_way")
    private String remind_way;

    /**
     * CRON表达式
     */
    @TableField(value = "cron")
    private String cron;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Todo other = (Todo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getRemind_way() == null ? other.getRemind_way() == null : this.getRemind_way().equals(other.getRemind_way()))
            && (this.getCron() == null ? other.getCron() == null : this.getCron().equals(other.getCron()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getRemind_way() == null) ? 0 : getRemind_way().hashCode());
        result = prime * result + ((getCron() == null) ? 0 : getCron().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", priority=").append(priority);
        sb.append(", category_id=").append(category_id);
        sb.append(", remind_way=").append(remind_way);
        sb.append(", cron=").append(cron);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
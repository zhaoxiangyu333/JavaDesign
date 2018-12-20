package cn.blz.design.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;


    @Override
    public Integer id() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

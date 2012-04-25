package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import play.db.ebean.Model;


@Entity
public class SimpleModel extends Model {
    @Id
    public Long id;

    public String name;

    public static Finder<Long, SimpleModel> find = new Finder(Long.class, SimpleModel.class);

    public static SimpleModel findById(Long id) {
        return find.byId(id);
    }
}
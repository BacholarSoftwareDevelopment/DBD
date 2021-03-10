package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "cats", schema = "public", catalog = "vetdb")
public class CatsEntity {
    private Long id;
    private Integer lifeCount;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "life_count")
    public Integer getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(Integer lifeCount) {
        this.lifeCount = lifeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CatsEntity that = (CatsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lifeCount != null ? !lifeCount.equals(that.lifeCount) : that.lifeCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lifeCount != null ? lifeCount.hashCode() : 0);
        return result;
    }
}

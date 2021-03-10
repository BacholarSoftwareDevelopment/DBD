package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "dogs", schema = "public", catalog = "vetdb")
public class DogsEntity {
    private Long id;
    private String barkPitch;

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
    @Column(name = "bark_pitch")
    public String getBarkPitch() {
        return barkPitch;
    }

    public void setBarkPitch(String barkPitch) {
        this.barkPitch = barkPitch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogsEntity that = (DogsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (barkPitch != null ? !barkPitch.equals(that.barkPitch) : that.barkPitch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (barkPitch != null ? barkPitch.hashCode() : 0);
        return result;
    }
}

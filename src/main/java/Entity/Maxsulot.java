package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Maxsulot {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
@Column(nullable = false)
    private String nomi ;

}

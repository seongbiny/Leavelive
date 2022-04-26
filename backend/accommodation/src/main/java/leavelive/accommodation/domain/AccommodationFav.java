package leavelive.accommodation.domain;

import leavelive.accommodation.domain.dto.AccommodationFavDto;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccommodationFav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accommodation_fav_id")
    private Long id;

    @Column(name="user_id")
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "accommodation_article_id")
    private AccommodationArticle accommodationArticle;

    public AccommodationFav of(AccommodationFavDto dto){
        return AccommodationFav.builder()
                .id(dto.getId())
                .userId(dto.getUserId())
                .accommodationArticle(dto.getAccommodationArticle())
                .build();
    }


}

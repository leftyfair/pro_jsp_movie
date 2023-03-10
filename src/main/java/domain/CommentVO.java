package domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentVO {
    private int id;
    private int movieId;
    private int memberId;
    private String commentText;
    private Date commentDate;
}
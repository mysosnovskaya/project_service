package faang.school.projectservice.contoller.moment;

import faang.school.projectservice.dto.moment.MomentDto;
import faang.school.projectservice.dto.moment.MomentFilterDto;
import faang.school.projectservice.model.Moment;
import faang.school.projectservice.service.moment.MomentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MomentController {
    private final MomentService momentService;

    @PostMapping("/create")
    public MomentDto createMoment(@RequestBody MomentDto momentDto) {
        momentService.createMoment(momentDto);
        return momentDto;
    }

    @PutMapping("/update")
    public MomentDto updateMoment(@RequestBody MomentDto momentDto) {
        momentService.updateMoment(momentDto);
        return momentDto;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<MomentDto> getAllMoments(){
        return momentService.getAllMoments();
    }
    @GetMapping("/{momentId}/")
    public MomentDto getMomentById(@PathVariable long momentId) {
        return momentService.getMomentById(momentId);
    }

}
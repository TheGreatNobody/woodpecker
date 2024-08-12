package tw.com.nobody.woodpecker.api.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.nobody.woodpecker.api.service.CityService;
import tw.com.nobody.woodpecker.api.service.bo.CityRelayBo;

@RestController
@RequestMapping("/city")
@Log4j2
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        super();
        this.cityService = cityService;
    }


    @GetMapping("/byId")
    CityRelayBo findCityById(Integer id) {
        log.info("findCityById: {}", id);
        return cityService.getCityById(id);
    }

}

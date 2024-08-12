package tw.com.nobody.woodpecker.api.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tw.com.nobody.woodpecker.api.service.CityService;
import tw.com.nobody.woodpecker.api.service.bo.CityRelayBo;
import tw.com.nobody.woodpecker.models.dto.CityDto;
import tw.com.nobody.woodpecker.models.mapper.CityMapper;

@Log4j2
@Service
public class CityServiceImpl implements CityService {

    private final CityMapper cityMapper;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public CityRelayBo getCityById(Integer id) {
        CityDto cityDto = cityMapper.findById(id);
        log.debug(cityDto.toString());
        CityRelayBo cityRelayBo = new CityRelayBo();
        cityRelayBo.setName(cityDto.getName());
        cityRelayBo.setCountryCode(cityDto.getCountryCode());
        cityRelayBo.setDistrict(cityDto.getDistrict());
        cityRelayBo.setPopulation(cityDto.getPopulation());
        cityRelayBo.setId(id);
        return cityRelayBo;
    }
}

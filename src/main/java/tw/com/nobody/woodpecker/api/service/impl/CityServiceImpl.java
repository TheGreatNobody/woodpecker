package tw.com.nobody.woodpecker.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.nobody.woodpecker.api.service.CityService;
import tw.com.nobody.woodpecker.api.service.bo.CityRelayBo;
import tw.com.nobody.woodpecker.models.dto.CityDto;
import tw.com.nobody.woodpecker.models.mapper.CityMapper;

//@Component
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

//    public void setCityMapper(CityMapper cityMapper) {
//        this.cityMapper = cityMapper;
//    }

    @Override
    public CityRelayBo getCityById(Integer id) {
        CityDto cityDto = cityMapper.findById(id);
        CityRelayBo cityRelayBo = new CityRelayBo();
        cityRelayBo.setName(cityDto.getName());
        cityRelayBo.setCountryCode(cityDto.getCountryCode());
        cityRelayBo.setDistrict(cityDto.getDistrict());
        cityRelayBo.setPopulation(cityDto.getPopulation());
        cityRelayBo.setId(id);
        return cityRelayBo;
    }
}

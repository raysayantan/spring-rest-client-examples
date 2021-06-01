package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class ApiServiceImpl implements ApiService {
    RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> geyUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
        return null;
    }
}

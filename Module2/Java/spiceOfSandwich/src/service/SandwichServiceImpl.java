package service;

import org.springframework.stereotype.Service;

@Service
public class SandwichServiceImpl implements SandwichService {

    @Override
    public String[] saveSpice(String[] spice) {
        return spice;
    }
}

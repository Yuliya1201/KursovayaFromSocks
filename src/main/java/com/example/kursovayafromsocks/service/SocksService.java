package com.example.kursovayafromsocks.service;


import com.example.kursovayafromsocks.dto.SocksDto;
import com.example.kursovayafromsocks.dto.request.SocksParamsRequest;
import com.example.kursovayafromsocks.exceptions.InvalidRequestParamsException;
import com.example.kursovayafromsocks.exceptions.NotEnoughItemsException;
import com.example.kursovayafromsocks.exceptions.SocksNotFoundException;

public interface SocksService {

    SocksDto incomeSocks(SocksDto socksDto);

    SocksDto outcomeSocks(SocksDto socksDto) throws SocksNotFoundException, NotEnoughItemsException;

    long getSocksCountByParams(SocksParamsRequest params) throws InvalidRequestParamsException;
}


package com.project.Transaksi.repository;

import com.project.Transaksi.model.Transaksi;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TransaksiMapper {

    @Insert("insert into transaksi(username,nomer,provider,paket,harga,tanggal) values (#{username},#{nomer},#{provider},#{paket},#{harga},now())")
    void insert(Transaksi transaksi);

    @Select("select * from transaksi where username = #{username}")
    List<Transaksi> findByUsername(String username);

    @Select("select password from user where email = #{email}")
    String password(String email);

    @Update("Update user set saldo = saldo - #{harga} where email = #{email}")
    void updateSaldo(float harga,String email);

    @Select("select saldo from user where email = #{email}")
    float saldo(String email);




}

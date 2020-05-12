package com.project.Transaksi;

import com.project.Transaksi.model.Transaksi;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Transaksi.class)
@MapperScan("com.project.Transaksi.repository")
@SpringBootApplication
public class TransaksiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransaksiApplication.class, args);
	}

}

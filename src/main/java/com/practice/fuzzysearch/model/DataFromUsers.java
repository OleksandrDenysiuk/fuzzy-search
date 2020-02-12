package com.practice.fuzzysearch.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "data_from_users")
@Getter
@Setter
@NoArgsConstructor
public class DataFromUsers extends Data {

    @Builder
    public DataFromUsers(Long id, String city, String address) {
        super(id, city, address);
    }
}

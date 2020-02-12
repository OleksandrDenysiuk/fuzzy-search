package com.practice.fuzzysearch.model;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class DataFromUsers extends Data {

}

package com.sunbeam.entity;

public class candidate {
int id;
String name;
String party;
int votes;
public candidate() {
	
}
public candidate(int id, String name, String party, int votes) {
	super();
	this.id = id;
	this.name = name;
	this.party = party;
	this.votes = votes;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getVotes() {
	return votes;
}
public void setVotes(int string) {
	this.votes = string;
}
@Override
public String toString() {
	return "candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
}



}

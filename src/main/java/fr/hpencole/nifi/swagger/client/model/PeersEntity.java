/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.hpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import fr.hpencole.nifi.swagger.client.model.PeerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PeersEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-21T18:12:37.188+02:00")
public class PeersEntity {
  @SerializedName("peers")
  private List<PeerDTO> peers = new ArrayList<PeerDTO>();

  public PeersEntity peers(List<PeerDTO> peers) {
    this.peers = peers;
    return this;
  }

  public PeersEntity addPeersItem(PeerDTO peersItem) {
    this.peers.add(peersItem);
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PeerDTO> getPeers() {
    return peers;
  }

  public void setPeers(List<PeerDTO> peers) {
    this.peers = peers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeersEntity peersEntity = (PeersEntity) o;
    return Objects.equals(this.peers, peersEntity.peers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeersEntity {\n");
    
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


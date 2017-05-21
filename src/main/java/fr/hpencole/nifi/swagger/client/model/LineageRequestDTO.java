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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LineageRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-21T18:12:37.188+02:00")
public class LineageRequestDTO {
  @SerializedName("eventId")
  private Long eventId = null;

  /**
   * The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.
   */
  public enum LineageRequestTypeEnum {
    @SerializedName("PARENTS")
    PARENTS("PARENTS"),
    
    @SerializedName("CHILDREN")
    CHILDREN("CHILDREN"),
    
    @SerializedName("FLOWFILE")
    FLOWFILE("FLOWFILE"),
    
    @SerializedName("and FLOWFILE")
    AND_FLOWFILE("and FLOWFILE");

    private String value;

    LineageRequestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("lineageRequestType")
  private LineageRequestTypeEnum lineageRequestType = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("clusterNodeId")
  private String clusterNodeId = null;

  public LineageRequestDTO eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public LineageRequestDTO lineageRequestType(LineageRequestTypeEnum lineageRequestType) {
    this.lineageRequestType = lineageRequestType;
    return this;
  }

   /**
   * The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.
   * @return lineageRequestType
  **/
  @ApiModelProperty(example = "null", value = "The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.")
  public LineageRequestTypeEnum getLineageRequestType() {
    return lineageRequestType;
  }

  public void setLineageRequestType(LineageRequestTypeEnum lineageRequestType) {
    this.lineageRequestType = lineageRequestType;
  }

  public LineageRequestDTO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The uuid that was used to generate the lineage.
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "The uuid that was used to generate the lineage.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public LineageRequestDTO clusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
    return this;
  }

   /**
   * The id of the node where this lineage originated if clustered.
   * @return clusterNodeId
  **/
  @ApiModelProperty(example = "null", value = "The id of the node where this lineage originated if clustered.")
  public String getClusterNodeId() {
    return clusterNodeId;
  }

  public void setClusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageRequestDTO lineageRequestDTO = (LineageRequestDTO) o;
    return Objects.equals(this.eventId, lineageRequestDTO.eventId) &&
        Objects.equals(this.lineageRequestType, lineageRequestDTO.lineageRequestType) &&
        Objects.equals(this.uuid, lineageRequestDTO.uuid) &&
        Objects.equals(this.clusterNodeId, lineageRequestDTO.clusterNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, lineageRequestType, uuid, clusterNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageRequestDTO {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    lineageRequestType: ").append(toIndentedString(lineageRequestType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
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


// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;


public class OFBsnTlvsVer11 implements OFBsnTlvs {
    public final static OFBsnTlvsVer11 INSTANCE = new OFBsnTlvsVer11();




    public OFBsnTlvActorKey.Builder buildActorKey() {
        throw new UnsupportedOperationException("OFBsnTlvActorKey not supported in version 1.1");
    }
    public OFBsnTlvActorKey actorKey(int value) {
        throw new UnsupportedOperationException("OFBsnTlvActorKey not supported in version 1.1");
    }

    public OFBsnTlvActorPortNum.Builder buildActorPortNum() {
        throw new UnsupportedOperationException("OFBsnTlvActorPortNum not supported in version 1.1");
    }
    public OFBsnTlvActorPortNum actorPortNum(int value) {
        throw new UnsupportedOperationException("OFBsnTlvActorPortNum not supported in version 1.1");
    }

    public OFBsnTlvActorPortPriority.Builder buildActorPortPriority() {
        throw new UnsupportedOperationException("OFBsnTlvActorPortPriority not supported in version 1.1");
    }
    public OFBsnTlvActorPortPriority actorPortPriority(int value) {
        throw new UnsupportedOperationException("OFBsnTlvActorPortPriority not supported in version 1.1");
    }

    public OFBsnTlvActorState.Builder buildActorState() {
        throw new UnsupportedOperationException("OFBsnTlvActorState not supported in version 1.1");
    }
    public OFBsnTlvActorState actorState(Set<OFBsnLacpState> value) {
        throw new UnsupportedOperationException("OFBsnTlvActorState not supported in version 1.1");
    }

    public OFBsnTlvActorSystemMac.Builder buildActorSystemMac() {
        throw new UnsupportedOperationException("OFBsnTlvActorSystemMac not supported in version 1.1");
    }
    public OFBsnTlvActorSystemMac actorSystemMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvActorSystemMac not supported in version 1.1");
    }

    public OFBsnTlvActorSystemPriority.Builder buildActorSystemPriority() {
        throw new UnsupportedOperationException("OFBsnTlvActorSystemPriority not supported in version 1.1");
    }
    public OFBsnTlvActorSystemPriority actorSystemPriority(int value) {
        throw new UnsupportedOperationException("OFBsnTlvActorSystemPriority not supported in version 1.1");
    }

    public OFBsnTlvBroadcastQueryTimeout.Builder buildBroadcastQueryTimeout() {
        throw new UnsupportedOperationException("OFBsnTlvBroadcastQueryTimeout not supported in version 1.1");
    }
    public OFBsnTlvBroadcastQueryTimeout broadcastQueryTimeout(long value) {
        throw new UnsupportedOperationException("OFBsnTlvBroadcastQueryTimeout not supported in version 1.1");
    }

    public OFBsnTlvCircuitId.Builder buildCircuitId() {
        throw new UnsupportedOperationException("OFBsnTlvCircuitId not supported in version 1.1");
    }
    public OFBsnTlvCircuitId circuitId(byte[] value) {
        throw new UnsupportedOperationException("OFBsnTlvCircuitId not supported in version 1.1");
    }

    public OFBsnTlvConvergenceStatus.Builder buildConvergenceStatus() {
        throw new UnsupportedOperationException("OFBsnTlvConvergenceStatus not supported in version 1.1");
    }
    public OFBsnTlvConvergenceStatus convergenceStatus(short value) {
        throw new UnsupportedOperationException("OFBsnTlvConvergenceStatus not supported in version 1.1");
    }

    public OFBsnTlvCrcEnabled.Builder buildCrcEnabled() {
        throw new UnsupportedOperationException("OFBsnTlvCrcEnabled not supported in version 1.1");
    }
    public OFBsnTlvCrcEnabled crcEnabled(short value) {
        throw new UnsupportedOperationException("OFBsnTlvCrcEnabled not supported in version 1.1");
    }

    public OFBsnTlvEthDst.Builder buildEthDst() {
        throw new UnsupportedOperationException("OFBsnTlvEthDst not supported in version 1.1");
    }
    public OFBsnTlvEthDst ethDst(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvEthDst not supported in version 1.1");
    }

    public OFBsnTlvEthSrc.Builder buildEthSrc() {
        throw new UnsupportedOperationException("OFBsnTlvEthSrc not supported in version 1.1");
    }
    public OFBsnTlvEthSrc ethSrc(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvEthSrc not supported in version 1.1");
    }

    public OFBsnTlvExternalGatewayIp.Builder buildExternalGatewayIp() {
        throw new UnsupportedOperationException("OFBsnTlvExternalGatewayIp not supported in version 1.1");
    }
    public OFBsnTlvExternalGatewayIp externalGatewayIp(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvExternalGatewayIp not supported in version 1.1");
    }

    public OFBsnTlvExternalGatewayMac.Builder buildExternalGatewayMac() {
        throw new UnsupportedOperationException("OFBsnTlvExternalGatewayMac not supported in version 1.1");
    }
    public OFBsnTlvExternalGatewayMac externalGatewayMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvExternalGatewayMac not supported in version 1.1");
    }

    public OFBsnTlvExternalIp.Builder buildExternalIp() {
        throw new UnsupportedOperationException("OFBsnTlvExternalIp not supported in version 1.1");
    }
    public OFBsnTlvExternalIp externalIp(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvExternalIp not supported in version 1.1");
    }

    public OFBsnTlvExternalMac.Builder buildExternalMac() {
        throw new UnsupportedOperationException("OFBsnTlvExternalMac not supported in version 1.1");
    }
    public OFBsnTlvExternalMac externalMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvExternalMac not supported in version 1.1");
    }

    public OFBsnTlvExternalNetmask.Builder buildExternalNetmask() {
        throw new UnsupportedOperationException("OFBsnTlvExternalNetmask not supported in version 1.1");
    }
    public OFBsnTlvExternalNetmask externalNetmask(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvExternalNetmask not supported in version 1.1");
    }

    public OFBsnTlvHeaderSize.Builder buildHeaderSize() {
        throw new UnsupportedOperationException("OFBsnTlvHeaderSize not supported in version 1.1");
    }
    public OFBsnTlvHeaderSize headerSize(long value) {
        throw new UnsupportedOperationException("OFBsnTlvHeaderSize not supported in version 1.1");
    }

    public OFBsnTlvIdleNotification idleNotification() {
        throw new UnsupportedOperationException("OFBsnTlvIdleNotification not supported in version 1.1");
    }

    public OFBsnTlvIdleTime.Builder buildIdleTime() {
        throw new UnsupportedOperationException("OFBsnTlvIdleTime not supported in version 1.1");
    }
    public OFBsnTlvIdleTime idleTime(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvIdleTime not supported in version 1.1");
    }

    public OFBsnTlvIdleTimeout.Builder buildIdleTimeout() {
        throw new UnsupportedOperationException("OFBsnTlvIdleTimeout not supported in version 1.1");
    }
    public OFBsnTlvIdleTimeout idleTimeout(long value) {
        throw new UnsupportedOperationException("OFBsnTlvIdleTimeout not supported in version 1.1");
    }

    public OFBsnTlvInternalGatewayMac.Builder buildInternalGatewayMac() {
        throw new UnsupportedOperationException("OFBsnTlvInternalGatewayMac not supported in version 1.1");
    }
    public OFBsnTlvInternalGatewayMac internalGatewayMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvInternalGatewayMac not supported in version 1.1");
    }

    public OFBsnTlvInternalMac.Builder buildInternalMac() {
        throw new UnsupportedOperationException("OFBsnTlvInternalMac not supported in version 1.1");
    }
    public OFBsnTlvInternalMac internalMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvInternalMac not supported in version 1.1");
    }

    public OFBsnTlvIpv4.Builder buildIpv4() {
        throw new UnsupportedOperationException("OFBsnTlvIpv4 not supported in version 1.1");
    }
    public OFBsnTlvIpv4 ipv4(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvIpv4 not supported in version 1.1");
    }

    public OFBsnTlvIpv4Dst.Builder buildIpv4Dst() {
        throw new UnsupportedOperationException("OFBsnTlvIpv4Dst not supported in version 1.1");
    }
    public OFBsnTlvIpv4Dst ipv4Dst(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvIpv4Dst not supported in version 1.1");
    }

    public OFBsnTlvIpv4Src.Builder buildIpv4Src() {
        throw new UnsupportedOperationException("OFBsnTlvIpv4Src not supported in version 1.1");
    }
    public OFBsnTlvIpv4Src ipv4Src(IPv4Address value) {
        throw new UnsupportedOperationException("OFBsnTlvIpv4Src not supported in version 1.1");
    }

    public OFBsnTlvMac.Builder buildMac() {
        throw new UnsupportedOperationException("OFBsnTlvMac not supported in version 1.1");
    }
    public OFBsnTlvMac mac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvMac not supported in version 1.1");
    }

    public OFBsnTlvMissPackets.Builder buildMissPackets() {
        throw new UnsupportedOperationException("OFBsnTlvMissPackets not supported in version 1.1");
    }
    public OFBsnTlvMissPackets missPackets(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvMissPackets not supported in version 1.1");
    }

    public OFBsnTlvName.Builder buildName() {
        throw new UnsupportedOperationException("OFBsnTlvName not supported in version 1.1");
    }
    public OFBsnTlvName name(byte[] value) {
        throw new UnsupportedOperationException("OFBsnTlvName not supported in version 1.1");
    }

    public OFBsnTlvPartnerKey.Builder buildPartnerKey() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerKey not supported in version 1.1");
    }
    public OFBsnTlvPartnerKey partnerKey(int value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerKey not supported in version 1.1");
    }

    public OFBsnTlvPartnerPortNum.Builder buildPartnerPortNum() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerPortNum not supported in version 1.1");
    }
    public OFBsnTlvPartnerPortNum partnerPortNum(int value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerPortNum not supported in version 1.1");
    }

    public OFBsnTlvPartnerPortPriority.Builder buildPartnerPortPriority() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerPortPriority not supported in version 1.1");
    }
    public OFBsnTlvPartnerPortPriority partnerPortPriority(int value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerPortPriority not supported in version 1.1");
    }

    public OFBsnTlvPartnerState.Builder buildPartnerState() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerState not supported in version 1.1");
    }
    public OFBsnTlvPartnerState partnerState(Set<OFBsnLacpState> value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerState not supported in version 1.1");
    }

    public OFBsnTlvPartnerSystemMac.Builder buildPartnerSystemMac() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerSystemMac not supported in version 1.1");
    }
    public OFBsnTlvPartnerSystemMac partnerSystemMac(MacAddress value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerSystemMac not supported in version 1.1");
    }

    public OFBsnTlvPartnerSystemPriority.Builder buildPartnerSystemPriority() {
        throw new UnsupportedOperationException("OFBsnTlvPartnerSystemPriority not supported in version 1.1");
    }
    public OFBsnTlvPartnerSystemPriority partnerSystemPriority(int value) {
        throw new UnsupportedOperationException("OFBsnTlvPartnerSystemPriority not supported in version 1.1");
    }

    public OFBsnTlvPort.Builder buildPort() {
        throw new UnsupportedOperationException("OFBsnTlvPort not supported in version 1.1");
    }
    public OFBsnTlvPort port(OFPort value) {
        throw new UnsupportedOperationException("OFBsnTlvPort not supported in version 1.1");
    }

    public OFBsnTlvQueueId.Builder buildQueueId() {
        throw new UnsupportedOperationException("OFBsnTlvQueueId not supported in version 1.1");
    }
    public OFBsnTlvQueueId queueId(long value) {
        throw new UnsupportedOperationException("OFBsnTlvQueueId not supported in version 1.1");
    }

    public OFBsnTlvQueueWeight.Builder buildQueueWeight() {
        throw new UnsupportedOperationException("OFBsnTlvQueueWeight not supported in version 1.1");
    }
    public OFBsnTlvQueueWeight queueWeight(long value) {
        throw new UnsupportedOperationException("OFBsnTlvQueueWeight not supported in version 1.1");
    }

    public OFBsnTlvReplyPackets.Builder buildReplyPackets() {
        throw new UnsupportedOperationException("OFBsnTlvReplyPackets not supported in version 1.1");
    }
    public OFBsnTlvReplyPackets replyPackets(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvReplyPackets not supported in version 1.1");
    }

    public OFBsnTlvRequestPackets.Builder buildRequestPackets() {
        throw new UnsupportedOperationException("OFBsnTlvRequestPackets not supported in version 1.1");
    }
    public OFBsnTlvRequestPackets requestPackets(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvRequestPackets not supported in version 1.1");
    }

    public OFBsnTlvRxPackets.Builder buildRxPackets() {
        throw new UnsupportedOperationException("OFBsnTlvRxPackets not supported in version 1.1");
    }
    public OFBsnTlvRxPackets rxPackets(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvRxPackets not supported in version 1.1");
    }

    public OFBsnTlvSamplingRate.Builder buildSamplingRate() {
        throw new UnsupportedOperationException("OFBsnTlvSamplingRate not supported in version 1.1");
    }
    public OFBsnTlvSamplingRate samplingRate(long value) {
        throw new UnsupportedOperationException("OFBsnTlvSamplingRate not supported in version 1.1");
    }

    public OFBsnTlvSubAgentId.Builder buildSubAgentId() {
        throw new UnsupportedOperationException("OFBsnTlvSubAgentId not supported in version 1.1");
    }
    public OFBsnTlvSubAgentId subAgentId(long value) {
        throw new UnsupportedOperationException("OFBsnTlvSubAgentId not supported in version 1.1");
    }

    public OFBsnTlvTxBytes.Builder buildTxBytes() {
        throw new UnsupportedOperationException("OFBsnTlvTxBytes not supported in version 1.1");
    }
    public OFBsnTlvTxBytes txBytes(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvTxBytes not supported in version 1.1");
    }

    public OFBsnTlvTxPackets.Builder buildTxPackets() {
        throw new UnsupportedOperationException("OFBsnTlvTxPackets not supported in version 1.1");
    }
    public OFBsnTlvTxPackets txPackets(U64 value) {
        throw new UnsupportedOperationException("OFBsnTlvTxPackets not supported in version 1.1");
    }

    public OFBsnTlvUdfAnchor.Builder buildUdfAnchor() {
        throw new UnsupportedOperationException("OFBsnTlvUdfAnchor not supported in version 1.1");
    }
    public OFBsnTlvUdfAnchor udfAnchor(OFBsnUdfAnchor value) {
        throw new UnsupportedOperationException("OFBsnTlvUdfAnchor not supported in version 1.1");
    }

    public OFBsnTlvUdfId.Builder buildUdfId() {
        throw new UnsupportedOperationException("OFBsnTlvUdfId not supported in version 1.1");
    }
    public OFBsnTlvUdfId udfId(int value) {
        throw new UnsupportedOperationException("OFBsnTlvUdfId not supported in version 1.1");
    }

    public OFBsnTlvUdfLength.Builder buildUdfLength() {
        throw new UnsupportedOperationException("OFBsnTlvUdfLength not supported in version 1.1");
    }
    public OFBsnTlvUdfLength udfLength(int value) {
        throw new UnsupportedOperationException("OFBsnTlvUdfLength not supported in version 1.1");
    }

    public OFBsnTlvUdfOffset.Builder buildUdfOffset() {
        throw new UnsupportedOperationException("OFBsnTlvUdfOffset not supported in version 1.1");
    }
    public OFBsnTlvUdfOffset udfOffset(int value) {
        throw new UnsupportedOperationException("OFBsnTlvUdfOffset not supported in version 1.1");
    }

    public OFBsnTlvUdpDst.Builder buildUdpDst() {
        throw new UnsupportedOperationException("OFBsnTlvUdpDst not supported in version 1.1");
    }
    public OFBsnTlvUdpDst udpDst(int value) {
        throw new UnsupportedOperationException("OFBsnTlvUdpDst not supported in version 1.1");
    }

    public OFBsnTlvUdpSrc.Builder buildUdpSrc() {
        throw new UnsupportedOperationException("OFBsnTlvUdpSrc not supported in version 1.1");
    }
    public OFBsnTlvUdpSrc udpSrc(int value) {
        throw new UnsupportedOperationException("OFBsnTlvUdpSrc not supported in version 1.1");
    }

    public OFBsnTlvUnicastQueryTimeout.Builder buildUnicastQueryTimeout() {
        throw new UnsupportedOperationException("OFBsnTlvUnicastQueryTimeout not supported in version 1.1");
    }
    public OFBsnTlvUnicastQueryTimeout unicastQueryTimeout(long value) {
        throw new UnsupportedOperationException("OFBsnTlvUnicastQueryTimeout not supported in version 1.1");
    }

    public OFBsnTlvVlanVid.Builder buildVlanVid() {
        throw new UnsupportedOperationException("OFBsnTlvVlanVid not supported in version 1.1");
    }
    public OFBsnTlvVlanVid vlanVid(VlanVid value) {
        throw new UnsupportedOperationException("OFBsnTlvVlanVid not supported in version 1.1");
    }

    public OFBsnTlvVrf.Builder buildVrf() {
        throw new UnsupportedOperationException("OFBsnTlvVrf not supported in version 1.1");
    }
    public OFBsnTlvVrf vrf(long value) {
        throw new UnsupportedOperationException("OFBsnTlvVrf not supported in version 1.1");
    }

    public OFMessageReader<OFBsnTlv> getReader() {
        throw new UnsupportedOperationException("Reader<OFBsnTlv> not supported in version 1.1");
    }


    public OFVersion getVersion() {
            return OFVersion.OF_11;
    }
}

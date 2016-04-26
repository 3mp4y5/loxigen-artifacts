// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFAsyncGetRequestVer13 implements OFAsyncGetRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFAsyncGetRequestVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 32;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_PACKET_IN_MASK_EQUAL_MASTER = 0x0L;
        private final static long DEFAULT_PACKET_IN_MASK_SLAVE = 0x0L;
        private final static long DEFAULT_PORT_STATUS_MASK_EQUAL_MASTER = 0x0L;
        private final static long DEFAULT_PORT_STATUS_MASK_SLAVE = 0x0L;
        private final static long DEFAULT_FLOW_REMOVED_MASK_EQUAL_MASTER = 0x0L;
        private final static long DEFAULT_FLOW_REMOVED_MASK_SLAVE = 0x0L;

    // OF message fields
    private final long xid;
    private final long packetInMaskEqualMaster;
    private final long packetInMaskSlave;
    private final long portStatusMaskEqualMaster;
    private final long portStatusMaskSlave;
    private final long flowRemovedMaskEqualMaster;
    private final long flowRemovedMaskSlave;
//
    // Immutable default instance
    final static OFAsyncGetRequestVer13 DEFAULT = new OFAsyncGetRequestVer13(
        DEFAULT_XID, DEFAULT_PACKET_IN_MASK_EQUAL_MASTER, DEFAULT_PACKET_IN_MASK_SLAVE, DEFAULT_PORT_STATUS_MASK_EQUAL_MASTER, DEFAULT_PORT_STATUS_MASK_SLAVE, DEFAULT_FLOW_REMOVED_MASK_EQUAL_MASTER, DEFAULT_FLOW_REMOVED_MASK_SLAVE
    );

    // package private constructor - used by readers, builders, and factory
    OFAsyncGetRequestVer13(long xid, long packetInMaskEqualMaster, long packetInMaskSlave, long portStatusMaskEqualMaster, long portStatusMaskSlave, long flowRemovedMaskEqualMaster, long flowRemovedMaskSlave) {
        this.xid = xid;
        this.packetInMaskEqualMaster = packetInMaskEqualMaster;
        this.packetInMaskSlave = packetInMaskSlave;
        this.portStatusMaskEqualMaster = portStatusMaskEqualMaster;
        this.portStatusMaskSlave = portStatusMaskSlave;
        this.flowRemovedMaskEqualMaster = flowRemovedMaskEqualMaster;
        this.flowRemovedMaskSlave = flowRemovedMaskSlave;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getPacketInMaskEqualMaster() {
        return packetInMaskEqualMaster;
    }

    @Override
    public long getPacketInMaskSlave() {
        return packetInMaskSlave;
    }

    @Override
    public long getPortStatusMaskEqualMaster() {
        return portStatusMaskEqualMaster;
    }

    @Override
    public long getPortStatusMaskSlave() {
        return portStatusMaskSlave;
    }

    @Override
    public long getFlowRemovedMaskEqualMaster() {
        return flowRemovedMaskEqualMaster;
    }

    @Override
    public long getFlowRemovedMaskSlave() {
        return flowRemovedMaskSlave;
    }

    @Override
    public List<OFAsyncConfigProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }



    public OFAsyncGetRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFAsyncGetRequest.Builder {
        final OFAsyncGetRequestVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean packetInMaskEqualMasterSet;
        private long packetInMaskEqualMaster;
        private boolean packetInMaskSlaveSet;
        private long packetInMaskSlave;
        private boolean portStatusMaskEqualMasterSet;
        private long portStatusMaskEqualMaster;
        private boolean portStatusMaskSlaveSet;
        private long portStatusMaskSlave;
        private boolean flowRemovedMaskEqualMasterSet;
        private long flowRemovedMaskEqualMaster;
        private boolean flowRemovedMaskSlaveSet;
        private long flowRemovedMaskSlave;

        BuilderWithParent(OFAsyncGetRequestVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAsyncGetRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskEqualMaster() {
        return packetInMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskEqualMaster(long packetInMaskEqualMaster) {
        this.packetInMaskEqualMaster = packetInMaskEqualMaster;
        this.packetInMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskSlave() {
        return packetInMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskSlave(long packetInMaskSlave) {
        this.packetInMaskSlave = packetInMaskSlave;
        this.packetInMaskSlaveSet = true;
        return this;
    }
    @Override
    public long getPortStatusMaskEqualMaster() {
        return portStatusMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskEqualMaster(long portStatusMaskEqualMaster) {
        this.portStatusMaskEqualMaster = portStatusMaskEqualMaster;
        this.portStatusMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getPortStatusMaskSlave() {
        return portStatusMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskSlave(long portStatusMaskSlave) {
        this.portStatusMaskSlave = portStatusMaskSlave;
        this.portStatusMaskSlaveSet = true;
        return this;
    }
    @Override
    public long getFlowRemovedMaskEqualMaster() {
        return flowRemovedMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskEqualMaster(long flowRemovedMaskEqualMaster) {
        this.flowRemovedMaskEqualMaster = flowRemovedMaskEqualMaster;
        this.flowRemovedMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getFlowRemovedMaskSlave() {
        return flowRemovedMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskSlave(long flowRemovedMaskSlave) {
        this.flowRemovedMaskSlave = flowRemovedMaskSlave;
        this.flowRemovedMaskSlaveSet = true;
        return this;
    }
    @Override
    public List<OFAsyncConfigProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFAsyncGetRequest.Builder setProperties(List<OFAsyncConfigProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }


        @Override
        public OFAsyncGetRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long packetInMaskEqualMaster = this.packetInMaskEqualMasterSet ? this.packetInMaskEqualMaster : parentMessage.packetInMaskEqualMaster;
                long packetInMaskSlave = this.packetInMaskSlaveSet ? this.packetInMaskSlave : parentMessage.packetInMaskSlave;
                long portStatusMaskEqualMaster = this.portStatusMaskEqualMasterSet ? this.portStatusMaskEqualMaster : parentMessage.portStatusMaskEqualMaster;
                long portStatusMaskSlave = this.portStatusMaskSlaveSet ? this.portStatusMaskSlave : parentMessage.portStatusMaskSlave;
                long flowRemovedMaskEqualMaster = this.flowRemovedMaskEqualMasterSet ? this.flowRemovedMaskEqualMaster : parentMessage.flowRemovedMaskEqualMaster;
                long flowRemovedMaskSlave = this.flowRemovedMaskSlaveSet ? this.flowRemovedMaskSlave : parentMessage.flowRemovedMaskSlave;

                //
                return new OFAsyncGetRequestVer13(
                    xid,
                    packetInMaskEqualMaster,
                    packetInMaskSlave,
                    portStatusMaskEqualMaster,
                    portStatusMaskSlave,
                    flowRemovedMaskEqualMaster,
                    flowRemovedMaskSlave
                );
        }

    }

    static class Builder implements OFAsyncGetRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean packetInMaskEqualMasterSet;
        private long packetInMaskEqualMaster;
        private boolean packetInMaskSlaveSet;
        private long packetInMaskSlave;
        private boolean portStatusMaskEqualMasterSet;
        private long portStatusMaskEqualMaster;
        private boolean portStatusMaskSlaveSet;
        private long portStatusMaskSlave;
        private boolean flowRemovedMaskEqualMasterSet;
        private long flowRemovedMaskEqualMaster;
        private boolean flowRemovedMaskSlaveSet;
        private long flowRemovedMaskSlave;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_ASYNC_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAsyncGetRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskEqualMaster() {
        return packetInMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskEqualMaster(long packetInMaskEqualMaster) {
        this.packetInMaskEqualMaster = packetInMaskEqualMaster;
        this.packetInMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getPacketInMaskSlave() {
        return packetInMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setPacketInMaskSlave(long packetInMaskSlave) {
        this.packetInMaskSlave = packetInMaskSlave;
        this.packetInMaskSlaveSet = true;
        return this;
    }
    @Override
    public long getPortStatusMaskEqualMaster() {
        return portStatusMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskEqualMaster(long portStatusMaskEqualMaster) {
        this.portStatusMaskEqualMaster = portStatusMaskEqualMaster;
        this.portStatusMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getPortStatusMaskSlave() {
        return portStatusMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setPortStatusMaskSlave(long portStatusMaskSlave) {
        this.portStatusMaskSlave = portStatusMaskSlave;
        this.portStatusMaskSlaveSet = true;
        return this;
    }
    @Override
    public long getFlowRemovedMaskEqualMaster() {
        return flowRemovedMaskEqualMaster;
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskEqualMaster(long flowRemovedMaskEqualMaster) {
        this.flowRemovedMaskEqualMaster = flowRemovedMaskEqualMaster;
        this.flowRemovedMaskEqualMasterSet = true;
        return this;
    }
    @Override
    public long getFlowRemovedMaskSlave() {
        return flowRemovedMaskSlave;
    }

    @Override
    public OFAsyncGetRequest.Builder setFlowRemovedMaskSlave(long flowRemovedMaskSlave) {
        this.flowRemovedMaskSlave = flowRemovedMaskSlave;
        this.flowRemovedMaskSlaveSet = true;
        return this;
    }
    @Override
    public List<OFAsyncConfigProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFAsyncGetRequest.Builder setProperties(List<OFAsyncConfigProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }
//
        @Override
        public OFAsyncGetRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long packetInMaskEqualMaster = this.packetInMaskEqualMasterSet ? this.packetInMaskEqualMaster : DEFAULT_PACKET_IN_MASK_EQUAL_MASTER;
            long packetInMaskSlave = this.packetInMaskSlaveSet ? this.packetInMaskSlave : DEFAULT_PACKET_IN_MASK_SLAVE;
            long portStatusMaskEqualMaster = this.portStatusMaskEqualMasterSet ? this.portStatusMaskEqualMaster : DEFAULT_PORT_STATUS_MASK_EQUAL_MASTER;
            long portStatusMaskSlave = this.portStatusMaskSlaveSet ? this.portStatusMaskSlave : DEFAULT_PORT_STATUS_MASK_SLAVE;
            long flowRemovedMaskEqualMaster = this.flowRemovedMaskEqualMasterSet ? this.flowRemovedMaskEqualMaster : DEFAULT_FLOW_REMOVED_MASK_EQUAL_MASTER;
            long flowRemovedMaskSlave = this.flowRemovedMaskSlaveSet ? this.flowRemovedMaskSlave : DEFAULT_FLOW_REMOVED_MASK_SLAVE;


            return new OFAsyncGetRequestVer13(
                    xid,
                    packetInMaskEqualMaster,
                    packetInMaskSlave,
                    portStatusMaskEqualMaster,
                    portStatusMaskSlave,
                    flowRemovedMaskEqualMaster,
                    flowRemovedMaskSlave
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFAsyncGetRequest> {
        @Override
        public OFAsyncGetRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 26
            byte type = bb.readByte();
            if(type != (byte) 0x1a)
                throw new OFParseError("Wrong type: Expected=OFType.GET_ASYNC_REQUEST(26), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 32)
                throw new OFParseError("Wrong length: Expected=32(32), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            long packetInMaskEqualMaster = U32.f(bb.readInt());
            long packetInMaskSlave = U32.f(bb.readInt());
            long portStatusMaskEqualMaster = U32.f(bb.readInt());
            long portStatusMaskSlave = U32.f(bb.readInt());
            long flowRemovedMaskEqualMaster = U32.f(bb.readInt());
            long flowRemovedMaskSlave = U32.f(bb.readInt());

            OFAsyncGetRequestVer13 asyncGetRequestVer13 = new OFAsyncGetRequestVer13(
                    xid,
                      packetInMaskEqualMaster,
                      packetInMaskSlave,
                      portStatusMaskEqualMaster,
                      portStatusMaskSlave,
                      flowRemovedMaskEqualMaster,
                      flowRemovedMaskSlave
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", asyncGetRequestVer13);
            return asyncGetRequestVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFAsyncGetRequestVer13Funnel FUNNEL = new OFAsyncGetRequestVer13Funnel();
    static class OFAsyncGetRequestVer13Funnel implements Funnel<OFAsyncGetRequestVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFAsyncGetRequestVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 26
            sink.putByte((byte) 0x1a);
            // fixed value property length = 32
            sink.putShort((short) 0x20);
            sink.putLong(message.xid);
            sink.putLong(message.packetInMaskEqualMaster);
            sink.putLong(message.packetInMaskSlave);
            sink.putLong(message.portStatusMaskEqualMaster);
            sink.putLong(message.portStatusMaskSlave);
            sink.putLong(message.flowRemovedMaskEqualMaster);
            sink.putLong(message.flowRemovedMaskSlave);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFAsyncGetRequestVer13> {
        @Override
        public void write(ByteBuf bb, OFAsyncGetRequestVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 26
            bb.writeByte((byte) 0x1a);
            // fixed value property length = 32
            bb.writeShort((short) 0x20);
            bb.writeInt(U32.t(message.xid));
            bb.writeInt(U32.t(message.packetInMaskEqualMaster));
            bb.writeInt(U32.t(message.packetInMaskSlave));
            bb.writeInt(U32.t(message.portStatusMaskEqualMaster));
            bb.writeInt(U32.t(message.portStatusMaskSlave));
            bb.writeInt(U32.t(message.flowRemovedMaskEqualMaster));
            bb.writeInt(U32.t(message.flowRemovedMaskSlave));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFAsyncGetRequestVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("packetInMaskEqualMaster=").append(packetInMaskEqualMaster);
        b.append(", ");
        b.append("packetInMaskSlave=").append(packetInMaskSlave);
        b.append(", ");
        b.append("portStatusMaskEqualMaster=").append(portStatusMaskEqualMaster);
        b.append(", ");
        b.append("portStatusMaskSlave=").append(portStatusMaskSlave);
        b.append(", ");
        b.append("flowRemovedMaskEqualMaster=").append(flowRemovedMaskEqualMaster);
        b.append(", ");
        b.append("flowRemovedMaskSlave=").append(flowRemovedMaskSlave);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFAsyncGetRequestVer13 other = (OFAsyncGetRequestVer13) obj;

        if( xid != other.xid)
            return false;
        if( packetInMaskEqualMaster != other.packetInMaskEqualMaster)
            return false;
        if( packetInMaskSlave != other.packetInMaskSlave)
            return false;
        if( portStatusMaskEqualMaster != other.portStatusMaskEqualMaster)
            return false;
        if( portStatusMaskSlave != other.portStatusMaskSlave)
            return false;
        if( flowRemovedMaskEqualMaster != other.flowRemovedMaskEqualMaster)
            return false;
        if( flowRemovedMaskSlave != other.flowRemovedMaskSlave)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (packetInMaskEqualMaster ^ (packetInMaskEqualMaster >>> 32));
        result = prime *  (int) (packetInMaskSlave ^ (packetInMaskSlave >>> 32));
        result = prime *  (int) (portStatusMaskEqualMaster ^ (portStatusMaskEqualMaster >>> 32));
        result = prime *  (int) (portStatusMaskSlave ^ (portStatusMaskSlave >>> 32));
        result = prime *  (int) (flowRemovedMaskEqualMaster ^ (flowRemovedMaskEqualMaster >>> 32));
        result = prime *  (int) (flowRemovedMaskSlave ^ (flowRemovedMaskSlave >>> 32));
        return result;
    }

}

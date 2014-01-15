// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetVlanPcpVer11 implements OFActionSetVlanPcp {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetVlanPcpVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;

        private final static VlanPcp DEFAULT_VLAN_PCP = VlanPcp.NONE;

    // OF message fields
    private final VlanPcp vlanPcp;
//
    // Immutable default instance
    final static OFActionSetVlanPcpVer11 DEFAULT = new OFActionSetVlanPcpVer11(
        DEFAULT_VLAN_PCP
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetVlanPcpVer11(VlanPcp vlanPcp) {
        this.vlanPcp = vlanPcp;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_PCP;
    }

    @Override
    public VlanPcp getVlanPcp() {
        return vlanPcp;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetVlanPcp.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetVlanPcp.Builder {
        final OFActionSetVlanPcpVer11 parentMessage;

        // OF message fields
        private boolean vlanPcpSet;
        private VlanPcp vlanPcp;

        BuilderWithParent(OFActionSetVlanPcpVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_PCP;
    }

    @Override
    public VlanPcp getVlanPcp() {
        return vlanPcp;
    }

    @Override
    public OFActionSetVlanPcp.Builder setVlanPcp(VlanPcp vlanPcp) {
        this.vlanPcp = vlanPcp;
        this.vlanPcpSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetVlanPcp build() {
                VlanPcp vlanPcp = this.vlanPcpSet ? this.vlanPcp : parentMessage.vlanPcp;
                if(vlanPcp == null)
                    throw new NullPointerException("Property vlanPcp must not be null");

                //
                return new OFActionSetVlanPcpVer11(
                    vlanPcp
                );
        }

    }

    static class Builder implements OFActionSetVlanPcp.Builder {
        // OF message fields
        private boolean vlanPcpSet;
        private VlanPcp vlanPcp;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_PCP;
    }

    @Override
    public VlanPcp getVlanPcp() {
        return vlanPcp;
    }

    @Override
    public OFActionSetVlanPcp.Builder setVlanPcp(VlanPcp vlanPcp) {
        this.vlanPcp = vlanPcp;
        this.vlanPcpSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetVlanPcp build() {
            VlanPcp vlanPcp = this.vlanPcpSet ? this.vlanPcp : DEFAULT_VLAN_PCP;
            if(vlanPcp == null)
                throw new NullPointerException("Property vlanPcp must not be null");


            return new OFActionSetVlanPcpVer11(
                    vlanPcp
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetVlanPcp> {
        @Override
        public OFActionSetVlanPcp readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 2
            short type = bb.readShort();
            if(type != (short) 0x2)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_VLAN_PCP(2), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            VlanPcp vlanPcp = VlanPcp.readByte(bb);
            // pad: 3 bytes
            bb.skipBytes(3);

            OFActionSetVlanPcpVer11 actionSetVlanPcpVer11 = new OFActionSetVlanPcpVer11(
                    vlanPcp
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetVlanPcpVer11);
            return actionSetVlanPcpVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetVlanPcpVer11Funnel FUNNEL = new OFActionSetVlanPcpVer11Funnel();
    static class OFActionSetVlanPcpVer11Funnel implements Funnel<OFActionSetVlanPcpVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetVlanPcpVer11 message, PrimitiveSink sink) {
            // fixed value property type = 2
            sink.putShort((short) 0x2);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.vlanPcp.putTo(sink);
            // skip pad (3 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetVlanPcpVer11> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetVlanPcpVer11 message) {
            // fixed value property type = 2
            bb.writeShort((short) 0x2);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.vlanPcp.writeByte(bb);
            // pad: 3 bytes
            bb.writeZero(3);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetVlanPcpVer11(");
        b.append("vlanPcp=").append(vlanPcp);
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
        OFActionSetVlanPcpVer11 other = (OFActionSetVlanPcpVer11) obj;

        if (vlanPcp == null) {
            if (other.vlanPcp != null)
                return false;
        } else if (!vlanPcp.equals(other.vlanPcp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((vlanPcp == null) ? 0 : vlanPcp.hashCode());
        return result;
    }

}

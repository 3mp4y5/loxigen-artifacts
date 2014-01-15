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
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmArpOpVer13 implements OFOxmArpOp {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmArpOpVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static ArpOpcode DEFAULT_VALUE = ArpOpcode.NONE;

    // OF message fields
    private final ArpOpcode value;
//
    // Immutable default instance
    final static OFOxmArpOpVer13 DEFAULT = new OFOxmArpOpVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmArpOpVer13(ArpOpcode value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<ArpOpcode> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmArpOp.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmArpOp.Builder {
        final OFOxmArpOpVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private ArpOpcode value;

        BuilderWithParent(OFOxmArpOpVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public OFOxmArpOp.Builder setValue(ArpOpcode value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ArpOpcode> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmArpOp build() {
                ArpOpcode value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmArpOpVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmArpOp.Builder {
        // OF message fields
        private boolean valueSet;
        private ArpOpcode value;

    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public OFOxmArpOp.Builder setValue(ArpOpcode value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ArpOpcode> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmArpOp build() {
            ArpOpcode value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmArpOpVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmArpOp> {
        @Override
        public OFOxmArpOp readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80002a02L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80002a02)
                throw new OFParseError("Wrong typeLen: Expected=0x80002a02L(0x80002a02L), got="+typeLen);
            ArpOpcode value = ArpOpcode.read2Bytes(bb);

            OFOxmArpOpVer13 oxmArpOpVer13 = new OFOxmArpOpVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmArpOpVer13);
            return oxmArpOpVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmArpOpVer13Funnel FUNNEL = new OFOxmArpOpVer13Funnel();
    static class OFOxmArpOpVer13Funnel implements Funnel<OFOxmArpOpVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmArpOpVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80002a02L
            sink.putInt((int) 0x80002a02);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmArpOpVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmArpOpVer13 message) {
            // fixed value property typeLen = 0x80002a02L
            bb.writeInt((int) 0x80002a02);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmArpOpVer13(");
        b.append("value=").append(value);
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
        OFOxmArpOpVer13 other = (OFOxmArpOpVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}

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

class OFOxmIpv6ExthdrVer13 implements OFOxmIpv6Exthdr {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6ExthdrVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static U16 DEFAULT_VALUE = U16.ZERO;

    // OF message fields
    private final U16 value;
//
    // Immutable default instance
    final static OFOxmIpv6ExthdrVer13 DEFAULT = new OFOxmIpv6ExthdrVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6ExthdrVer13(U16 value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004e02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<U16> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmIpv6Exthdr.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6Exthdr.Builder {
        final OFOxmIpv6ExthdrVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U16 value;

        BuilderWithParent(OFOxmIpv6ExthdrVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004e02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Exthdr.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmIpv6Exthdr build() {
                U16 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIpv6ExthdrVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmIpv6Exthdr.Builder {
        // OF message fields
        private boolean valueSet;
        private U16 value;

    @Override
    public long getTypeLen() {
        return 0x80004e02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Exthdr.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmIpv6Exthdr build() {
            U16 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIpv6ExthdrVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6Exthdr> {
        @Override
        public OFOxmIpv6Exthdr readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80004e02L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004e02)
                throw new OFParseError("Wrong typeLen: Expected=0x80004e02L(0x80004e02L), got="+typeLen);
            U16 value = U16.of(bb.readShort());

            OFOxmIpv6ExthdrVer13 oxmIpv6ExthdrVer13 = new OFOxmIpv6ExthdrVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6ExthdrVer13);
            return oxmIpv6ExthdrVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6ExthdrVer13Funnel FUNNEL = new OFOxmIpv6ExthdrVer13Funnel();
    static class OFOxmIpv6ExthdrVer13Funnel implements Funnel<OFOxmIpv6ExthdrVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6ExthdrVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004e02L
            sink.putInt((int) 0x80004e02);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6ExthdrVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmIpv6ExthdrVer13 message) {
            // fixed value property typeLen = 0x80004e02L
            bb.writeInt((int) 0x80004e02);
            bb.writeShort(message.value.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6ExthdrVer13(");
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
        OFOxmIpv6ExthdrVer13 other = (OFOxmIpv6ExthdrVer13) obj;

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

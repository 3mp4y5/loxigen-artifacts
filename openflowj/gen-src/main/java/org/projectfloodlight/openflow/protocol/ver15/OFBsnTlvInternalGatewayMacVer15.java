// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvInternalGatewayMacVer15 implements OFBsnTlvInternalGatewayMac {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvInternalGatewayMacVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 10;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
//
    // Immutable default instance
    final static OFBsnTlvInternalGatewayMacVer15 DEFAULT = new OFBsnTlvInternalGatewayMacVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvInternalGatewayMacVer15(MacAddress value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvInternalGatewayMacVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvInternalGatewayMac.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvInternalGatewayMac.Builder {
        final OFBsnTlvInternalGatewayMacVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;

        BuilderWithParent(OFBsnTlvInternalGatewayMacVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvInternalGatewayMac.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvInternalGatewayMac build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvInternalGatewayMacVer15(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvInternalGatewayMac.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;

    @Override
    public int getType() {
        return 0x1c;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvInternalGatewayMac.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBsnTlvInternalGatewayMac build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvInternalGatewayMacVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvInternalGatewayMac> {
        @Override
        public OFBsnTlvInternalGatewayMac readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1c
            short type = bb.readShort();
            if(type != (short) 0x1c)
                throw new OFParseError("Wrong type: Expected=0x1c(0x1c), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 10)
                throw new OFParseError("Wrong length: Expected=10(10), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            MacAddress value = MacAddress.read6Bytes(bb);

            OFBsnTlvInternalGatewayMacVer15 bsnTlvInternalGatewayMacVer15 = new OFBsnTlvInternalGatewayMacVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvInternalGatewayMacVer15);
            return bsnTlvInternalGatewayMacVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvInternalGatewayMacVer15Funnel FUNNEL = new OFBsnTlvInternalGatewayMacVer15Funnel();
    static class OFBsnTlvInternalGatewayMacVer15Funnel implements Funnel<OFBsnTlvInternalGatewayMacVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvInternalGatewayMacVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x1c
            sink.putShort((short) 0x1c);
            // fixed value property length = 10
            sink.putShort((short) 0xa);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvInternalGatewayMacVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvInternalGatewayMacVer15 message) {
            // fixed value property type = 0x1c
            bb.writeShort((short) 0x1c);
            // fixed value property length = 10
            bb.writeShort((short) 0xa);
            message.value.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvInternalGatewayMacVer15(");
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
        OFBsnTlvInternalGatewayMacVer15 other = (OFBsnTlvInternalGatewayMacVer15) obj;

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

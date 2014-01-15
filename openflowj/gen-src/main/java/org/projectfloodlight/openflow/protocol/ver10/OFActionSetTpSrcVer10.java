// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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

class OFActionSetTpSrcVer10 implements OFActionSetTpSrc {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetTpSrcVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 8;

        private final static TransportPort DEFAULT_TP_PORT = TransportPort.NONE;

    // OF message fields
    private final TransportPort tpPort;
//
    // Immutable default instance
    final static OFActionSetTpSrcVer10 DEFAULT = new OFActionSetTpSrcVer10(
        DEFAULT_TP_PORT
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetTpSrcVer10(TransportPort tpPort) {
        this.tpPort = tpPort;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_TP_SRC;
    }

    @Override
    public TransportPort getTpPort() {
        return tpPort;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFActionSetTpSrc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetTpSrc.Builder {
        final OFActionSetTpSrcVer10 parentMessage;

        // OF message fields
        private boolean tpPortSet;
        private TransportPort tpPort;

        BuilderWithParent(OFActionSetTpSrcVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_TP_SRC;
    }

    @Override
    public TransportPort getTpPort() {
        return tpPort;
    }

    @Override
    public OFActionSetTpSrc.Builder setTpPort(TransportPort tpPort) {
        this.tpPort = tpPort;
        this.tpPortSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFActionSetTpSrc build() {
                TransportPort tpPort = this.tpPortSet ? this.tpPort : parentMessage.tpPort;
                if(tpPort == null)
                    throw new NullPointerException("Property tpPort must not be null");

                //
                return new OFActionSetTpSrcVer10(
                    tpPort
                );
        }

    }

    static class Builder implements OFActionSetTpSrc.Builder {
        // OF message fields
        private boolean tpPortSet;
        private TransportPort tpPort;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_TP_SRC;
    }

    @Override
    public TransportPort getTpPort() {
        return tpPort;
    }

    @Override
    public OFActionSetTpSrc.Builder setTpPort(TransportPort tpPort) {
        this.tpPort = tpPort;
        this.tpPortSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFActionSetTpSrc build() {
            TransportPort tpPort = this.tpPortSet ? this.tpPort : DEFAULT_TP_PORT;
            if(tpPort == null)
                throw new NullPointerException("Property tpPort must not be null");


            return new OFActionSetTpSrcVer10(
                    tpPort
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetTpSrc> {
        @Override
        public OFActionSetTpSrc readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 9
            short type = bb.readShort();
            if(type != (short) 0x9)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_TP_SRC(9), got="+type);
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
            TransportPort tpPort = TransportPort.read2Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);

            OFActionSetTpSrcVer10 actionSetTpSrcVer10 = new OFActionSetTpSrcVer10(
                    tpPort
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetTpSrcVer10);
            return actionSetTpSrcVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetTpSrcVer10Funnel FUNNEL = new OFActionSetTpSrcVer10Funnel();
    static class OFActionSetTpSrcVer10Funnel implements Funnel<OFActionSetTpSrcVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetTpSrcVer10 message, PrimitiveSink sink) {
            // fixed value property type = 9
            sink.putShort((short) 0x9);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.tpPort.putTo(sink);
            // skip pad (2 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetTpSrcVer10> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetTpSrcVer10 message) {
            // fixed value property type = 9
            bb.writeShort((short) 0x9);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.tpPort.write2Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetTpSrcVer10(");
        b.append("tpPort=").append(tpPort);
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
        OFActionSetTpSrcVer10 other = (OFActionSetTpSrcVer10) obj;

        if (tpPort == null) {
            if (other.tpPort != null)
                return false;
        } else if (!tpPort.equals(other.tpPort))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((tpPort == null) ? 0 : tpPort.hashCode());
        return result;
    }

}
